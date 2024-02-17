<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String email = request.getParameter("email");
String name = request.getParameter("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
	if (id == null || id.isEmpty() || email == null || email.isEmpty() || name == null || name.isEmpty()) {
	%>

	<script>
		alert('업데이트를 위해 모든 내용을 빠짐없이 입력해주세요.');
		history.back();
	</script>

	<%
	} else {
	MemberDao dao = MemberDao.getInstance();
	Member member = new Member(id, email, name);
	int result = dao.update(member);
	if (result > 0) {
		session.setAttribute("member", member);
	%>

	<script>
		alert('수정이 완료되었습니다.');
		opener.location.reload(true); // 사용자 이름이 바뀌었으면 바로 반영
		window.close();
	</script>
	
	<%
	} else {
	%>
	
	<script>
		alert('업데이트에 실패했습니다.');
		window.close();
	</script>
	<%
	}
	}
	%>

</body>
</html>