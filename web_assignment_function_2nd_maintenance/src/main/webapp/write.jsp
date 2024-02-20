<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>기업형 웹 페이지</title>
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
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<script src="http://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css" />
<script defer src="js/ie.js"></script>
</head>
<body>
	<header>
		<div class="inner">
			<h1>
				<a href="#">DCODLAB</a>
			</h1>

			<ul id="gnb">
				<li><a href="#">DEPARTMENT</a></li>
				<li><a href="#">GALLERY</a></li>
				<li><a href="#">YOUTUBE</a></li>
				<li><a href="#">COMMUNITY</a></li>
				<li><a href="#">LOCATION</a></li>
			</ul>

			<ul class="util">
				<li><a href="#">Contact</a></li>
				<li><a href="#">Help</a></li>
				<li><a href="login_main.jsp">Login</a></li>
				<li><a href="#">Join</a></li>
				<li><a href="#">Sitemap</a></li>
			</ul>
		</div>
	</header>
	<figure>


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
			response.sendRedirect("index.html");
			return;
		}
		%>
		<%
		request.setCharacterEncoding("utf-8");

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
		%>
		<%
		if (member.getName().equals(writer)) {
			action = "update.jsp?num=" + num;
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
	</figure>
</body>
</html>
