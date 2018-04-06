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
	<c:if test="${!empty sessionScope.isLogin}">
		<h1>${sessionScope.id} 님 안녕하세요!</h1>
	</c:if>
	
	<c:if test="${empty sessionScope.isLogin}">
		<h1>메인 페이지입니다</h1>		
	</c:if>
	
	<p><a href="/board/list">게시판 목록</a></p>	
	<p><a href="/auth/loginP">로그인 페이지</a></p>
	<p><a href="/auth/logout">로그아웃</a></p>
</body>
</html>