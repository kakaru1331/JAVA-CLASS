# 오라클 끄고 켜기

## 시스템 연결

~~~
$ sqlplus ./nolog
$ conn /as sysdba
~~~

## 오라클 서비스 끄기

~~~
SQL> shutdown IMMEDIATE
~~~

## 오라클 서비스 켜기

~~~
SQL> startup
~~~

## 리스너 끄기

~~~
$ lsnrctl stop
~~~

## 리스너 켜기

~~~
$ lsnrctl start
~~~

---

# 그냥 다 필요없고 bat 파일 짱짱맨

매번 위의 과정을 하는 것은 stupid!   
프로그래머답게 일처리를 해보자.   
방법은 아주 간단하다.    

1. 텍스트 에디터를 킨다.
2. 아래 내용을 입력하고 .bat 확장자로 저장해주자.
3. 마음껏 쓰자!

## 오라클 끄기

~~~
net stop OracleDBConsoleroot
net stop OracleMTSRecoveryService
net stop OracleOraDb11g_home1TNSListener
net stop OracleServiceROOT
isqlplusctl stop
~~~

## 오라클 켜기
~~~
net start OracleDBConsoleroot
net start OracleMTSRecoveryService
net start OracleOraDb11g_home1TNSListener
net start OracleServiceROOT
isqlplusctl stop
~~~