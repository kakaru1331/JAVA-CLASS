<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	HashMap<String, Object> mapData = new HashMap<String, Object>();
	mapData.put("name", "kakaru");
	mapData.put("today", new Date());	
%>
<c:set var="intArray" value="<%= new int[] {1,2,3,4,5} %>" />
<c:set var="List" value="<%= Arrays.asList(1,2,3,4,5,6,7,8,9,10) %>" />
<c:set var="map" value="<%= mapData %>" />
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>c:foreach practice</title>
</head>
<body>
	<h4>1부터 100까지 홀수의 합</h4>
	<c:set var="sum" value="0" />
	<c:forEach var="i" begin="1" end="100" step="2">
		<c:set var="sum" value="${sum+i}" />
	</c:forEach>
	
	<p>결과: ${sum}</p>
	
	<h4>구구단 4단</h4>
	<ul>
		<c:forEach var="i" begin="1" end="9">
			<li>4 * ${i} = ${4*i}</li>
		</c:forEach>
	</ul>
	
	<h4>정수 배열</h4>
	<c:forEach var="i" items="${intArray}">
		<li>${i}</li>	
	</c:forEach>
	
	<h4>정수 리스트</h4>
	<c:forEach var="elem" items="${List}" begin="1" step="2" varStatus="status">
		<li>Even number in List: ${elem}</li>	
	</c:forEach>
	
	<h4>Map</h4>
	<c:forEach var="i" items="${map}">
		<li>${i.key} = ${i.value}</li>
	</c:forEach>
</body>
</html>