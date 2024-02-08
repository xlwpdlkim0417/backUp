<%@page import="util.Cookies"%>
<%@ page contentType="text/html; charset=utf-8"%>

<%
Cookies cookies = new Cookies(request);
%>
<html>
<head>
<title>로그인여부 검사</title>
</head>
<body>

	<%
	if (cookies.exists("logindata")) {
	%>
	아이디 "<%=cookies.getValue("logindata")%>"로 로그인 한 상태
	<%
	} else {
	%>
	로그인하지 않은 상태
	<%
	}
	%>
	<!-- response.sendRedirect("index.jsp");-->
	<a href="index.jsp">index</a>
</body>
</html>
