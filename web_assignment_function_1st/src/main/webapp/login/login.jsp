<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
String email = request.getParameter("pw");

MemberDao dao = MemberDao.getInstance();
Member member = dao.selectForLogin(id, email);

if (member != null) {
	session.setAttribute("member", member);
	response.sendRedirect("login_main.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<script>
		alert('아이디 또는 비밀번호가 틀립니다!');
		history.back();
	</script>

</body>
</html>