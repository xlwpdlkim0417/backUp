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
		<%@ page import="dao.CommenDao"%>
		<%@ page import="dto.Commen"%>
		<%@ page import="dao.MemberDao"%>
		<%@ page import="dto.Member"%>
		<%@ page import="dao.BoardDao"%>
		<%@ page import="dto.Board"%>
		<%@ page import="java.util.List"%>
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

		CommenDao dao = CommenDao.getInstance();
		List<Commen> list = dao.selectList();
		%>

		<form action="../_member/logout.jsp" method="post">
			<%=member.getName()%>님 로그인 <input type="submit" value="로그아웃">
			<input type="button" value="회원정보 수정"
				onclick="window.open('../_member/member_update_form.jsp', 'popup', 'width=600, height=300')">
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
			for (Commen commen : list) {
			%>
			<tr>
				<td><%=commen.getNum()%></td>
				<td><a href="../_board/list_one.jsp?writer=<%=commen.getWriter()%>"><%=commen.getWriter()%></a></td>
				<td><%=commen.getRegtime()%></td>
				<td><%=commen.getHits()%></td>
			</tr>
			<%
			}
			%>
		</table>

		<br>
		<input type="button" value="글쓰기" onclick="location.href='../_board/write.jsp'">
</body>
</html>
