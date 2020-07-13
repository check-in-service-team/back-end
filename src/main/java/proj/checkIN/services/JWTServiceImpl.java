package proj.checkIN.services;

import java.sql.SQLException;
import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import proj.checkIN.DB.TokenKeyDAOImpl;
import proj.checkIN.DB.TokenKeyDTO;

@Service
public class JWTServiceImpl implements JWTService{
	@Autowired
	RedisService redis;
	
	private static String MOBILE = "_M";
	
	private String stringKey;
	SecretKey key;

	public String create(String agentID, boolean mobile_status) {
		String keyId = agentID;		
		
		key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
		
		this.stringKey = Base64.getEncoder().encodeToString(key.getEncoded());
		
		Date date = new Date(System.currentTimeMillis() + 600000); //1시간
		String jws = Jwts.builder()
				.setHeaderParam(JwsHeader.KEY_ID, keyId)
				.setExpiration(date)
				.setSubject("check-in_token")
				.signWith(key)
				.compact();
		
		if(mobile_status) {
			redis.del(agentID+MOBILE);
			redis.setToken(agentID+MOBILE, stringKey);
			return jws;
		}
		
		TokenKeyDTO dto = new TokenKeyDTO();
		dto.setAgentID(agentID);
		dto.setToken(stringKey);

		try {
			TokenKeyDAOImpl token = TokenKeyDAOImpl.getInstance();
			token.delete(dto);
			token.insert(dto);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jws;
	}
	
	@Override
	public boolean validation(String jwsString, String agentID, boolean mobile_status) {
		Jws<Claims> jws;
		TokenKeyDTO dto = new TokenKeyDTO();
		dto.setAgentID(agentID);
		try {
			SigningKeyResolver signingKeyResolver = new MySigningKeyResolver(dto, mobile_status);
			jws = Jwts.parserBuilder()
			.setSigningKeyResolver(signingKeyResolver)
			.build()
			.parseClaimsJws(jwsString);
			
			return true;
		} catch(ClaimJwtException e){
	    	System.out.println("Claim JWT Exception");
		} catch(MalformedJwtException e) {
	    	System.out.println("Malformed JWT Exception");
		} catch(UnsupportedJwtException e) {
			System.out.println("Unsupported JWT Exception");
		} catch(JwtException ex) {
	    	System.out.println("JWT Exception");
			return false;
		}
		return false;	
	}
}