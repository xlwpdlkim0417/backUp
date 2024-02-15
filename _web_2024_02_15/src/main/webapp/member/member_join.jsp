<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
	MemberDao mdao = MemberDao.getInstance();
	Member member = new Member();
	int result = mdao.idcheck(member);
	if (result == 1) {
	%>
	<script>
		alert('이미 등록된 아이디입니다.');
		history.back()
	</script>
	<%
	} else {

	// 새로운 회원정보를 DB에 추가하는 쿼리
	mdao.signup(member);
	%>
	<script>
		alert('가입이 완료되었습니다.');
		window.close();
	</script>
	<%
	}
	%>
</body>
</html>