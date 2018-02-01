# 데이터베이스 환경 구축

## Oracle Database 11g

- Download "Oracle Database 11g Rlease2"    
- Copy folder2 and paste into folder1/database/stage/components
- setup.exe

**sqlplus**   

~~~
사용자명 입력: system
비밀번호 입력: 'password'
~~~

**테이블 스페이스 생성**

~~~
CREATE TABLESPACE myts DATAFILE
'C:/app/chongs/oradata/root/myts.dbf' SIZE 100M AUTOEXTEND ON NEXT 5M;
~~~

**사용자 생성**

~~~
CREATE USER kakaru IDENTIFIED BY 'password'
DEFAULT TABLESPACE MYTS
TEMPORARY TABLESPACE TEMP;
~~~

**롤 부여**

~~~
GRANT DBA TO kakaru;
~~~

~~~
CONNECT kakaru/'password'; // 연결
SELECT user FROM dual; // 확인
~~~

## SQL Developer

도구 - NLS   
날짜 형식 => YYYY/MM/DD   
시간 기록 형식 => HH24:MI:SS    

**샘플 스키마**    

1. URL: github.com/gilbutitbook/006696
2. download 'expall.dmp' & 'expcust.dmp

~~~
imp kakaru/'password' file=expall.dmp log=empall.log ignore=y grants=y rows=y full=y
~~~

# 데이터베이스 삭제

1. oracle 관련 서비스 모두 중지
2. deinstall.bat (관리자 권한)
3. 오라클 디렉터리 삭제
4. regedit
  - HKEY_LOCAL_MACHINE-SOFTWARE -> 오라클 관련 삭제
  - HKEY_LOCAL_MACHINE-SYSTEM-ControlSet001-services -> 삭제
  - HKEY_LOCAL_MACHINE-SYSTEM-ControlSet002-services -> 삭제
  - HKEY_LOCAL_MACHINE-SYSTEM-ControlSet-services -> 삭제