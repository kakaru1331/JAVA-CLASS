<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>	
	<c:set var="postList" value="${sessionScope.postList}" />	
		
	<h2>${postList[param.index].get("title")}</h2>	
	
	<p>${postList[param.index].get("description")}</p>	
	
	<a href="/board/modifyP?index=${param.index}">수정</a></b>
	<br>
	<a href="/board/delete?index=${param.index}">삭제</a><b>
</body>
</html>