<%@ page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("loginForm.do");
	return;
}
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

	<div class="container" style="padding-top: 50px;">

		<table class="table table-bordered table-hover">
			<tr>
				<th class="num">번호</th>
				<th class="title">제목</th>
				<th class="writer">작성자</th>
				<th class="regtime">작성일시</th>
				<th>조회수</th>
			</tr>
			<c:forEach var="board" items="${list }">

				<tr>
					<td>${board.num }</td>
					<td style="text-align: left;"><a
						href="view.do?num=${board.num }"> ${board.title } </a></td>
					<td>${board.writer }</td>
					<td>${board.regtime }</td>
					<td>${board.hits }</td>
				</tr>
			</c:forEach>
		</table>

		<br> <input type="button" class="btn btn-dark" value="글쓰기"
			onclick="location.href='write.jsp'">
		<!-- 기존 버튼에 class="btn btn-dark" 추가해준 거임 -->
		<!-- 우리가 <div class="container" style="padding-top: 50px;"> 이걸 추가했잖아 -->
		<button type="button" class="btn btn-dark"
			onclick="location.href='write.jsp'">글쓰기</button>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
