<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
try {request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");
Cookie cookie = new Cookie(id, URLEncoder.encode(pw, "utf-8"));
cookie.setMaxAge(60*60*24*365);
response.addCookie(cookie);} catch(Exception e){
%>
아이디 비밀번호를 입력해서 회원가입을 진행해주세요.
<%
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- response.sendRedirect("index.jsp"); -->
<a href="index.jsp">index</a>
</body>
</html>