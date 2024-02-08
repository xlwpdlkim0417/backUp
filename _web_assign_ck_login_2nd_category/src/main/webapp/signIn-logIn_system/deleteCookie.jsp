<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
Cookie[] cookie = request.getCookies();
if (cookie != null && cookie.length > 0) {
	for (Cookie ck : cookie) {
		if (ck.getName().equals(id)) {
	Cookie cookies = new Cookie(id, "");
	cookies.setMaxAge(0);
	response.addCookie(cookies);
	
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
아이디 패스워드 삭제 = 회원 탈퇴?
<!-- response.sendRedirect("index.jsp"); -->
<a href="index.jsp">index</a>
</body>
</html>