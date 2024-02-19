<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
	Member member = (Member) session.getAttribute("member");
	if (member != null) {
		response.sendRedirect("list.jsp");
	} else {
	%>

	<form action="login.jsp" method="post">
		아이디: <input type="text" name="id">&nbsp;&nbsp;
		이메일: <input type="text" name="pw">
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onclick="window.open('member_join_form.jsp', 'popup', 'width=600, height=300')">
	</form>

	<%
	}
	%>

</body>
</html>
