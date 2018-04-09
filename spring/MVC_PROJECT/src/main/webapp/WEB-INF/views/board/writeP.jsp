<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>
	<form action="/board/write" method="POST">
		<p>제목<br><input type="text" name="title"></p>
		<br>
		<p>내용<br><textarea name="description" rows="10" cols="40"></textarea></p>
		<input type="submit" value="작성">
	</form>
</body>
</html>