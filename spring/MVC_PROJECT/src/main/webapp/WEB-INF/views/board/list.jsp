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
	<a href="/main">대문으로</a>	 
	<h1>게시판 목록</h1>
	<c:if test="${!empty sessionScope.postList}">		
		<c:set var="postList" value="${sessionScope.postList}" />
			<h2>제목</h2>	
		<c:forEach var="post" items="${postList}" varStatus="current">
			${current.count}. <a href="/board/detail?index=${current.index}">${post.get("title")}</a><p>
		</c:forEach>
	</c:if>
	<a href="/board/writeP">글쓰기</a>
</body>
</html>