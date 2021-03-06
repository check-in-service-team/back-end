package proj.checkIN.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnector {
    private static MariaDBConnector mdbc;

    private MariaDBConnector() {}

    public static MariaDBConnector getInstance() {
        if (mdbc == null) {
            mdbc = new MariaDBConnector();
        }
        return mdbc;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://checkin.c9rx0ccvnmw0.us-east-2.rds.amazonaws.com:3306/checkIN";
        Connection con = DriverManager.getConnection(url, "admin", "klose0409");

        return con;
    }
}
