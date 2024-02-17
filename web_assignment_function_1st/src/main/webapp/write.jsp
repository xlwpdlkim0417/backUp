<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("login_main.jsp");
}
%>
<%
String tmp = request.getParameter("num");
int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;

String writer = "";
String title = "";
String content = "";
String action = "insert.jsp";

if (num > 0) {
	BoardDao dao = BoardDao.getInstance();
	Board board = dao.selectOne(num, false);

	writer = board.getWriter();
	title = board.getTitle();
	content = board.getContent();

	action = "update.jsp?num=" + num;
}
%>

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

	<form method="post" action="<%=action%>">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" maxlength="80"
					value="<%=title%>"></td>
			</tr>
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

		<br> <input type="submit" value="저장"> <input
			type="button" value="취소" onclick="history.back()">
	</form>

</body>
</html>
