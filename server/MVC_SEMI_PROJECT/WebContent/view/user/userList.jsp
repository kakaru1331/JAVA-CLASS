<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
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
				<th>Name</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Reg Date</th>
			</tr>
			<%
				List memberList = (List)request.getAttribute("memberList");
				for (int i=0; i < memberList.size(); i++) {
					Map map = (Map)memberList.get(i);
			%>
					<tr>
						<td><%= map.get("name") %></td>
						<td><%= map.get("age") %></td>
						<td><%= map.get("gender") %></td>
						<td><%= map.get("reg_date") %></td>					
					</tr>
			<% 
					
				} 
			%>
		</table>	
	</div>	
</body>
</html>