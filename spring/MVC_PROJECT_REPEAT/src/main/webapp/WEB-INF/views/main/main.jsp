<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>	
</head>
<body>
	<div>
		<span>로그인 결과</span>
	</div>
	
	<c:if test="${ !empty sessionScope.userID }">
		<div>
			<span>${sessionScope.userID} 님 안녕하세요.</span>
			<a href="/auth/logout">로그아웃</a>			
		</div>
	</c:if>
	
	<c:if test="${ empty sessionScope.userID }">
		<div>
			<span>로그인 해주세요.</span>
			<span><a href="/auth/loginP">로그인 페이지</a></span>
		</div>	
	</c:if>
</body>
</html>