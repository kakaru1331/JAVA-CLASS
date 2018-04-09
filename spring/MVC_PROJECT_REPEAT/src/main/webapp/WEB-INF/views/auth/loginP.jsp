<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>
</head>
<body>
	<div>
		<span>로그인</span>
	</div>
	
	<div>
		<form action="/auth/login" method="POST" id="login_form">
			<input type="text" name="id" id="user_id">
			<input type="password" name="pw">
			<input type="submit" id="login_btn" value="로그인">
		</form>
	</div>	
</body>
</html>