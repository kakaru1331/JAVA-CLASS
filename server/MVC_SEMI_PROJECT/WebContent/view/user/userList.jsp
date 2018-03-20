<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title></title>
</head>
<body>
	<div>
		<span>전체 회원 리스트 (${ memberList.stream().count() })</span>
	</div>
	<div>
		<table>
			<tr>
				<th>No.</th>
				<th>Name</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Reg Date</th>
			</tr>
			<%-- <%
				List memberList = (List)request.getAttribute("memberList");
				for (int i=0; i < memberList.size(); i++) {
					Map map = (Map)memberList.get(i);
			%> --%>
			<c:forEach var="member" items="${memberList}" varStatus="status">
				<c:if test="${member.age >= 25}">
					<tr>
						<td>${status.count}</td>					
						<td><c:out value="${member.name}"/></td>					
						<td>${member.age}</td>
						<td>${member.gender}</td>
						<td>${member.reg_date}</td>						
					</tr>
				</c:if>								
			</c:forEach>
			
			<%-- <tr>
					<td><%= map.get("name") %></td>
					<td><%= map.get("age") %></td>
					<td><%= map.get("gender") %></td>
					<td><%= map.get("reg_date") %></td>					
				</tr>
			<% 					
				} 
			%> --%>
		</table>	
	</div>	
</body>
</html>