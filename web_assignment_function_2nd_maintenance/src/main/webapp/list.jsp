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
	background-color: cyan;
}

.num {
	width: 80px;
}

.title {
	width: 230px;
}

.writer {
	width: 100px;
}

.regtime {
	width: 180px;
}

a:link {
	text-decoration: none;
	color: blue;
}

a:visited {
	text-decoration: none;
	color: gray;
}

a:hover {
	text-decoration: none;
	color: red;
}
</style>
</head>
<body>
	
	<%@page import="dao.MemberDao"%>
	<%@page import="dto.Member"%>
	<%@page import="dao.BoardDao"%>
	<%@page import="dto.Board"%>
	<%@page import="java.util.List"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<%
	Member member = (Member) session.getAttribute("member");
	if (member == null) {
		response.sendRedirect("index.html");
		return;
	}
	%>
	<%
	request.setCharacterEncoding("utf-8");

	BoardDao dao = BoardDao.getInstance();
	List<Board> list = dao.selectList();
	%>

	<form action="logout.jsp" method="post">
		<%=member.getName()%>님 로그인 <input type="submit" value="로그아웃">
		<input type="button" value="회원정보 수정"
			onclick="window.open('member_update_form.jsp', 'popup', 'width=600, height=300')">
	</form>

	<table>
		<tr>
			<th class="num">번호</th>
			<th class="title">제목</th>
			<th class="writer">작성자</th>
			<th class="regtime">작성일시</th>
			<th>조회수</th>
		</tr>
		<%
		for (Board board : list) {
		%>
		<tr>
			<td><%=board.getNum()%></td>
			<td style="text-align: left;"><a
				href="view.jsp?num=<%=board.getNum()%>"> <%=board.getTitle()%>
			</a></td>
			<td><a href="list_one.jsp?writer=<%=board.getWriter()%>"><%=board.getWriter()%></a></td>
			<td><%=board.getRegtime()%></td>
			<td><%=board.getHits()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<br>
	<input type="button" value="글쓰기" onclick="location.href='write.jsp'">
</body>
</html>
