<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty loginCheck.id}">
	${loginCheck.id }님 로그인을 환영합니다
	<br>
			<meta http-equiv="refresh" content="0; url=list" />
		</c:when>
		<c:otherwise>
            로그인이 필요합니다.
            <br>
			<meta http-equiv="refresh" content="0; url=login" />
		</c:otherwise>
	</c:choose>
	<a href="move">홈</a>
</body>
</html>