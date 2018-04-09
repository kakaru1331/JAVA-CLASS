<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>
	
	<form action="/board/modify?index=${param.index}" method="POST">
		<p>제목<br><input type="text" name="title" value="${post.get("title")}"></p>
		<br>		
		<p>내용<br><textarea name="description" rows="10" cols="40">${post.get("description")}</textarea></p>
		<input type="submit" value="수정">
	</form>	
</body>
</html>