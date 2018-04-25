<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<title>Home</title>
<script src="/resources/js/jquery-2.1.1.min.js" type="text/javascript"></script>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<div id="display">
		추천수 <span id="count">0</span>
	</div>
	<div>
		<input type="button" id="btnUP" value="UP"> 
		<input type="button" id="btnDOWN" value="DOWN">
	</div>

	<script type="text/javascript">
		var count = $('#count');
		
		$('#btnUP, #btnDOWN').on('click', function() {
			var type;
			
			if ('UP' == this.value)
				type = 1;
	
			if ('DOWN' == this.value)
				type = 2;			
			
			$.ajax({
				  method: "POST"
				  ,url: "/vote3"
				  ,data : {
					  type : type
				  }
				})
				  .done(function(msg) {
					  var jo = JSON.parse(msg);					  
					  console.log(jo.result);
					  console.log(jo.data);
					  console.log(jo.error);
					  
					  count.text(jo.data);
					/* $('#display').html(msg); */
				  });
		});
		
		/* $('#btnUP').on('click', () => {			
			$.ajax({
				  method: "POST",
				  url: "/vote?button=UP"
				})
				  .done(function( msg ) {
				    count.text(msg);
				  });
		});
		
		$('#btnDOWN').on('click', () => {			
			$.ajax({
				  method: "POST",
				  url: "/vote?button=DOWN"
				})
				  .done(function( msg ) {
				    count.text(msg);
				  });
		}); */
		
	</script>
</body>
</html>
