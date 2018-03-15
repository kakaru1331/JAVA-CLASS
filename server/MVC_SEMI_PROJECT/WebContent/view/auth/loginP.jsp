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
		<form action="/login.do" method="POST">
			<input type="text" name="id">
			<input type="password" name="pw">
			<input type="submit">
		</form>
	</div>
</body>
</html>