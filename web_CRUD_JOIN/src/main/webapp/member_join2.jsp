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

	MemberDao dao = MemberDao.getInstance();
	Member member = dao.select(id);

	if (member != null) {
		// 이미 있는 아이디이면 오류 표시
	%>

	<script>
		alert('이미 등록된 아이디입니다.');
		history.back()
	</script>

	<%
	} else {
	Member member2 = new Member(id, email, name);
	dao.insert(member2);

	if (member2.getId() == null || member2.getId().length() == 0 || member2.getEmail() == null
			|| member2.getEmail().length() == 0 || member2.getName() == null || member2.getName().length() == 0) {
	%>
	<script>
		alert('모든 내용을 빠짐없이 입력해주세요.');
		window.close();
	</script>
	<%
	} else {
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