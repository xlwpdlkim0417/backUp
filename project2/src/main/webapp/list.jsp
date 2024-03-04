
<%@page import="dao.BoardDao"%>
<%@page import="dto.ArticlePage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="util.Cookies"%>
<%@page import="java.util.List"%>
<%@page import="dto.newBoard"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
Cookies cookies = new Cookies(request); //request 기본 객체를 집어 넣어 줘야 합니다
%>

<%
BoardDao dao = BoardDao.getInstance();
/* List<newBoard> list = dao.selectList(); */
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>

	<%
	int pagenow = 1;
	int pageSize = 1;
	if (request.getParameter("pagenow") != null) {
		pagenow = Integer.parseInt(request.getParameter("pagenow"));
	}

	int totalPosts = dao.selectListNum();

	int totalPages = totalPosts / pageSize;
	if (totalPosts % pageSize > 0) {
		totalPages++;
	}

	List<newBoard> list = dao.selectList(pagenow, pageSize);
	%>
	<div class="container" style="padding-top: 50px;">

		<table class="table table-bordered table-hover">
			<tr>
				<th class="num">번호</th>
				<th class="title">제목</th>
				<th class="writer">작성자</th>
				<th class="regtime">작성일시</th>
				<th>조회수</th>
			</tr>
			<%
			for (newBoard newboard : list) {
			%>
			<tr>
				<td><%=newboard.getNum()%></td>
				<td style="text-align: left;"><a
					href="view.jsp?num=<%=newboard.getNum()%>"> <%=newboard.getTitle()%>
				</a></td>
				<td><%=newboard.getName()%></td>
				<td><%=newboard.getRegtime()%></td>
				<td><%=newboard.getHits()%></td>
			</tr>
			<%
			}
			%>
		</table>

		<%
		for (int i = 1; i <= totalPages; i++) {
		%>
		<a class="page-link text-black" href="list.jsp?pagenow=<%=i%>"><%=i%></a>
		<%
		}
		%>

		<br> <input type="button" class="btn btn-dark" value="글쓰기"
			onclick="location.href='write.jsp'">

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
