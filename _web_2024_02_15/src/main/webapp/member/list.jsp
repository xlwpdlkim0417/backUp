<%@page import="util.Cookies"%>
<%@page import="java.util.List"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
Cookies cookies = new Cookies(request); //request 기본 객체를 집어 넣어 줘야 합니다
%>
<%
String memberId = (String) session.getAttribute("MEMBERID");
String memberPw = (String) session.getAttribute("MEMBERPW");
if (memberId == null) {
	response.sendRedirect("sessionLoginForm.jsp");
}
%>
<%
BoardDao dao = BoardDao.getInstance();
List<Board> list = dao.selectList();
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
<form action="sessionLogout.jsp" method="post">
<%=memberPw%> 회원님 로그인 하셨습니다
<input type="submit" value="로그아웃">
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
			<td><%=board.getWriter()%></td>
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
