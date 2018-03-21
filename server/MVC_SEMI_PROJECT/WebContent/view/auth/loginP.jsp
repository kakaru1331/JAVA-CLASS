<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>
	<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="/js/jquery.cookie.js"></script>
</head>
<body>
	<div>
		<span>로그인</span>
	</div>
	
	<div>
		<form action="/login.do" method="POST">
			<input type="text" name="id" id="user_id">
			<input type="password" name="pw">
			<input type="button" id="login_btn" value="로그인">
		</form>
	</div>
	
	<div>
		<label>
			<input type="checkbox" id="id_store_check_box"> 아이디 저장
		</label>
	</div>		
	
	<script type="text/javascript">
		var id_store_check_box = $('#id_store_check_box');
		var login_btn = $('#login_btn');
		var user_id = $('#user_id');		
		
		//console.log( $('#id_store_check_box').prop('checked') );
		//console.log(id_store_check_box);
		user_id.val($.cookie('user_id'));
		
		/* id_store_check_box.on('click', function() {
			console.log( $('#id_store_check_box').prop('checked') );
		}); */
		
		login_btn.on('click', function() {
			if (id_store_check_box.prop('checked')) {
				alert('Create a login cookie');
				
				$.cookie('isStored', true);
				$.cookie('user_id', user_id.val())
			} else {
				alert('Delete the login cookie');
				
				$.removeCookie('isStored');
				$.removeCookie('user_id');
			}
		});
		
		console.log($.cookie('user_id'));
		
	</script>
	
</body>
</html>