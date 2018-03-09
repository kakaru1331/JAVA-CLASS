<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<%
	Date now = new Date();
	System.out.println(this.getServletContext().getRealPath("/"));
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>date</title>
</head>
<body>
	<h1>나의 첫 JSP!</h1>
	<h3>현재 시각: <%= now %></h3>
</body>
</html>