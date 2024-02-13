<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Cookies cookies = new Cookies(request); //request 기본 객체를 집어 넣어 줘야 합니다
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="result.jsp">
		<%
		if (cookies.exists("email")) {
		%>
		email: <input type="text" name="email"
			value="<%=cookies.getValue("email")%>" />
		<%
		} else {
		%>
		email: <input type="text" name="email" />
		<%
		}
		%>
		remember me: <input type="checkbox" name="remember" checked /> <input
			type="submit" />
	</form>
</body>
</html>