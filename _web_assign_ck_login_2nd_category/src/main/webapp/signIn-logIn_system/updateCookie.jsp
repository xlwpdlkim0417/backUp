<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");
Cookie[] cookies = request.getCookies();
if (cookies != null && cookies.length > 0) {
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals(id)) {
	Cookie cookie = new Cookie(id, URLEncoder.encode(pw, "utf-8"));
	cookie.setMaxAge(60 * 60 * 24 * 365);
	response.addCookie(cookie);
	/* response.sendRedirect("loginindex.jsp"); */
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 패스워드 변경 = 회원 정보 업데이트
<!-- response.sendRedirect("index.jsp"); -->
<a href="index.jsp">index</a>
</body>
</html>