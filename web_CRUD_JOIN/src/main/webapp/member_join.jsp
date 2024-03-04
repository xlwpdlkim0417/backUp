<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String email = request.getParameter("email");
	String name = request.getParameter("name");

	if (id == null || id.trim().isEmpty() || email == null || email.trim().isEmpty() || name == null
			|| name.trim().isEmpty()) {
	%>
	
	<script>
		alert('모든 내용을 빠짐없이 입력해주세요.');
		history.back()
	</script>
	
	<%
	} else {
	MemberDao dao = MemberDao.getInstance();
	Member member = dao.select(id);
	if (member != null) {
	%>

	<script>
		alert('이미 등록된 아이디입니다.');
		history.back()
	</script>

	<%
	} else {

	Member member2 = new Member(id, email, name);
	dao.insert(member2);
	%>

	<script>
		alert('가입이 완료되었습니다.');
		window.close();
	</script>

	<%
	}
	}
	%>

</body>
</html>