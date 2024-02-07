<%@page import="util.Cookies"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String combinedValue = id + "|" + URLEncoder.encode(pw, "UTF-8");

Cookie[] cookie = request.getCookies();
//쿠키 만들고 가져오라는 명령어
if (cookie != null && cookie.length > 0) {
	for (Cookie ck : cookie) {
		if (!ck.getName().equals("JSESSIONID")) {
	if (id.equals(ck.getName()) && pw.equals(URLDecoder.decode(ck.getValue(), "utf-8"))) {
		// ID와 암호가 같으면 로그인에 성공한 것으로 판단.
		response.addCookie(Cookies.createCookie("userCredentials", combinedValue, "/", 60 * 60 * 24 * 365));
	}
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
<body>아이디 패스워드 확인 = 로그인
<!-- response.sendRedirect("index.jsp"); -->
<a href="index.jsp">index</a>
</body>
</html>