<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLEncoder"%>
<%
request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
String value = request.getParameter("value");
Cookie[] cookies = request.getCookies();
if (cookies != null && cookies.length > 0) {
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals(name)) {
	Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
	response.addCookie(cookie);
	response.sendRedirect("listCookies.jsp");
		}
	}
}
%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

</body>
</html>
