<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>
</head>
<body>
	<div>
		<span>결과</span>
	</div>
	
	<div>
		<span><%= request.getAttribute("msg") %></span>
		<span>${requestScope.msg}</span>
	</div>
	
	<script>
		var msg = '<%= request.getAttribute("msg") %>';
		var name = '<%= request.getAttribute("name") %>'
		
		if (msg === 'Y') {
			alert(name + ' 님 안녕하세요!');
		} else {
			alert('일치하는 회원이 없어요.');
			document.location.href = '/loginP.do';
		}			
	</script>
</body>
</html>