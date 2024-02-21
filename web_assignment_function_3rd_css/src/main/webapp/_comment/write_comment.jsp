<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 680px;
	text-align: center;
}

th {
	width: 100px;
	background-color: cyan;
}

input[type=text], textarea {
	width: 100%;
}
</style>
</head>
<body>
	<%@ page import="dao.CommenDao"%>
	<%@ page import="dto.Commen"%>
	<%@ page import="dao.MemberDao"%>
	<%@ page import="dto.Member"%>
	<%@ page import="dao.BoardDao"%>
	<%@ page import="dto.Board"%>
	<%@ page import="java.sql.*"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<%
	Member member = (Member) session.getAttribute("member");
	if (member == null) {
		response.sendRedirect("../index.html");
		return;
	}
	%>
	<%
	request.setCharacterEncoding("utf-8");

	String tmp = request.getParameter("num");
	int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;

	String writer = "";
	String content = "";
	String action = "insert_comment.jsp";

	if (num > 0) {
		CommenDao dao = CommenDao.getInstance();
		Commen commen = dao.selectOne(num, false);

		writer = commen.getWriter();
		content = commen.getContent();
	%>
	<%
	if (member.getName().equals(writer)) {
		action = "update_comment.jsp?num=" + num;
	} else {
	%>
	<script>
		alert('작성자 only 업데이트.');
		history.back();
	</script>
	<%
	}
	}
	%>

	<form method="post" action="<%=action%>">
		<table>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" maxlength="20"
					value="<%=member.getName()%>" readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" rows="10"><%=content%></textarea>
				</td>
			</tr>
		</table>

		<br> <input type="submit" value="저장">
		<input type="button" value="취소" onclick="history.back()">
	</form>
</body>
</html>
