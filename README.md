# Check-In Service API server

## API for PC Client
### **POST /checkIN/signUp/signAccount<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /checkIN/signUp/verifyEmail<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /signIn<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /signOut<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /siteAdd<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /siteEdit<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /siteDelete<br>**
:sign-up the Check-In service<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

## API for Mobile App
### **POST /signIn_M<br>**
:sign-in the Check-In service app<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /signOut_M<br>**
:sign-in the Check-In service app<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /remoteSignOut<br>**
:sign-in the Check-In service app<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /loginNumber<br>**
:sign-in the Check-In service app<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~

### **POST /accessLog<br>**
:sign-in the Check-In service app<br>
#### Request Data
~~~
  body:
  {
    "agentID": "회원가입 할 계정에 대한 이메일",
    "agentPW": "회원가입 할 계정에 대한 비밀번호",
    "name": "사용자 이름"
    "errorCount": "로그인 시도 오류 횟수", (Default value = 0)
    "numberOfDevice": "추가 등록한 모바일 기기의 개수", (Default value = 0)
  }
~~~
