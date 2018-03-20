<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>functions</title>
</head>
<body>
	<c:set var="str1" value="Functions <태그>를 사용합니다." />
	<c:set var="str2" value="사용" />
	<c:set var="tokens" value="1,2,3,4,5,6,7,8,9,10" />
	
	<p>length(str1)= ${fn:length(str1)}</p>
	<p>toUpperCase(str1)= ${fn:toUpperCase(str1)}</p>	
	<p>toLowerCase(str1)= ${fn:toLowerCase(str1)}</p>
	<p>substring(str1, 3, 6)= ${fn:substring(str1, 3, 6)}</p>>
	<p>substringAfter(str1, str2)= ${fn:substringAfter(str1, str2)}</p>>
	<p>substringBefore(str1, str2)= ${fn:substringBefore(str1, str2)}</p>>
	<p>trim(str1)= ${fn:trim(str1)}</p>
	<p>replace(str1, " ", "-")= ${fn:replace(str1, " ", "-")}</p>
	<p>indexOf(str1, str2)= ${fn:indexOf(str1, str2)}</p>
	<p>startsWith(str1, 'Fun')= ${fn:startsWith(str1, 'Fun')}</p>
	<p>endsWith(str1, str2)= ${fn:endsWith(str1, str2)}</p>
	<p>contains(str1, str2)= ${fn:contains(str1, str2)}</p>
	<p>containsIgnoreCase(str1, 'fun')= ${fn:containsIgnoreCase(str1, 'fun')}</p>
	
	<c:set var="array" value="${fn:split(tokens, ',')}" />
	<p>join(array, "-")= ${fn:join(array, "-")}</p>
	<p>escapeXml(a tag)= ${fn:escapeXml("<a>")}</p>		
</body>
</html>