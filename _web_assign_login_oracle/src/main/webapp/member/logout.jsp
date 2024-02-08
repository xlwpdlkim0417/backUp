<%@page import="util.Cookies"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
response.addCookie(Cookies.createCookie("AUTH", "", "/", 0));
%>
<html>
<head>
<title>로그아웃</title>
</head>
<body>로그아웃하였습니다.

</body>
</html>
