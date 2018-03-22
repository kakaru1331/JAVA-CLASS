<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>
	<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<div>
		<span>로그인 결과</span>
	</div>
	
	<c:if test="${!empty sessionScope.userInfo}">
		<div>
			<span>${sessionScope.userInfo.name} 님 안녕하세요.</span>
			<input type="button" value="로그아웃" id="logout_btn">
		</div>	
	</c:if>
	
	<c:if test="${empty sessionScope.userInfo}">
		<div>
			<span>로그인 해주세요.</span>
			<span><a href="/loginP.do">로그인 페이지</a></span>
		</div>	
	</c:if>
	
<%-- 	<div>
		<span><%= request.getAttribute("msg") %></span>
		<span>${requestScope.msg}</span>
	</div> --%>
	
	<script>
		<%-- var msg = '<%= request.getAttribute("msg") %>';
		var name = '<%= request.getAttribute("name") %>' --%>
		
		/* var userInfo = ${sessionScope.userInfo};
		console.log(userInfo); */
		
		var logout_btn = $('#logout_btn');
		
		logout_btn.on('click', function() {			
			document.location.href = "/logout.do";
		});
		
		/* if (msg === 'Y') {
			alert(name + ' 님 안녕하세요!' + c_seq);
		} else {
			alert('일치하는 회원이 없어요.');
			document.location.href = '/loginP.do';
		}		 */	
	</script>
</body>
</html>