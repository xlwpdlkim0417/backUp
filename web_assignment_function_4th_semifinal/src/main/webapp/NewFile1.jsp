<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String id = request.getParameter("id");
Member member = MemberDao.getInstance().select(id);

MemberDao.getInstance().delete(member);

Cookie cookie = new Cookie("email", null);
Cookie cookie2 = new Cookie("id", null);
cookie.setMaxAge(0); 
cookie2.setMaxAge(0); 
response.addCookie(cookie);
response.addCookie(cookie2);

session.removeAttribute("userId");
session.removeAttribute("userEmail");
session.removeAttribute("member");

response.sendRedirect("list1.jsp");

%>
</body>
</html>