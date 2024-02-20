<%@ page import="util.Cookies"%>
<%@ page import="dao.CommenDao"%>
<%@ page import="dto.Commen"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("index.html");
}
%>
<%

request.setCharacterEncoding("utf-8");

int num = Integer.parseInt(request.getParameter("num"));

String writer = "";
String title = "";
String content = "";
String regtime = "";
int hits = 0;
int likes = 0;
String commentwriter = request.getParameter("commentwriter");
String commentcontent = request.getParameter("commentcontent");

BoardDao dao = BoardDao.getInstance();
Cookies cookies = new Cookies(request);
if (cookies.exists("MEMBERLOG") && cookies.getValue("MEMBERLOG").equals(dao.selectOneDelete(num).getWriter())) {
	Board board = dao.selectOne(num, false);


	writer = board.getWriter();
	title = board.getTitle();
	content = board.getContent();
	regtime = board.getRegtime();
	hits = board.getHits();
	likes = board.getLikes();

	title = title.replace(" ", "&nbsp;");
	content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
} else {
	Board board = dao.selectOne(num, true);


	writer = board.getWriter();
	title = board.getTitle();
	content = board.getContent();
	regtime = board.getRegtime();
	hits = board.getHits();
	likes = board.getLikes();

	title = title.replace(" ", "&nbsp;");
	content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
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

td {
	text-align: left;
	border: 1px solid gray;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>제목</th>
			<td><%=title%></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><%=writer%></td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><%=regtime%></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td><%=hits%></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%=content%></td>
		</tr>
	</table>

	<br>
	<input type="button" value="좋아요"
		onclick="location.href='likes.jsp?num=<%=num%>'"><%=likes%>
	<br>
	<br>
	

	<input type="button" value="목록보기" onclick="location.href='list.jsp'">
	<input type="button" value="수정"
		onclick="location.href='write.jsp?num=<%=num%>'">
	<input type="button" value="삭제"
		onclick="location.href='delete.jsp?num=<%=num%>'">

	<br>
	<br>
	<br>
	<br>

	<form method="post" action="insert_comment.jsp">
		<table>
			<tr>
			<th>글 번호</th>
				<td><input type="text" name="num" maxlength="20" value="<%=num%>" readonly></td>
				</tr>
				<tr>
				<th>작성자</th>
				<td><input type="text" name="commentwriter" maxlength="20" value="<%=member.getName()%>" readonly></td>
			
				<th>내용</th>
				<td><input type="text" name="commentcontent" rows="10">
				</td>
			</tr>
		</table>

		<br>
		<input type="submit" value="저장">
		<input type="button" value="수정" onclick="location.href='write_comment.jsp?num=<%=num%>'">
		<input type="button" value="삭제" onclick="location.href='delete_comment.jsp?num=<%=num%>'">
	</form>

	<%
	CommenDao daocom = CommenDao.getInstance();
	List<Commen> list = daocom.selectListOne(num);
	%>

	<table>
		<tr>
			
			<th class="writer">작성자</th>
			<th class="content">내용</th>

		</tr>
		<%
		for (Commen commen : list) {
		%>
		<tr>
			
			<td><a href="list_one.jsp?writer=<%=commen.getWriter()%>"><%=commen.getWriter()%></a></td>
			<td><%=commen.getContent()%></td>

		</tr>
		<%
		}
		%>
	</table>


</body>
</html>
