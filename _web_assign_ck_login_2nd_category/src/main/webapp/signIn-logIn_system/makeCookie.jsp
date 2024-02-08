<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
try {request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");
Cookie cookie = new Cookie(id, URLEncoder.encode(pw, "utf-8"));
cookie.setMaxAge(60*60*24*365);
/* 1년이 유지되는 건 아니야 왜냐하면 브라우저에서 쿠키를 삭제한다던지 서버에서 조정한다던지로 일방적인 관리가 가능하기 때문에 차라리 일정 시간 있다가 삭제되는 걸로 만드는게 나을걸 */
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