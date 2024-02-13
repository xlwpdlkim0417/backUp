<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String str = request.getParameter("mmm");
%>

<%
int num = Integer.parseInt(str);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int i=1; i<=9; i++) {
%>
	<h1> <%=num %> X <%=i %> = <%=(num * i)%> </h1>
<%} %>


</body>
</html>