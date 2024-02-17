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
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
<body>
<form action="sessionLogout.jsp" method="post">
<%=memberPw%> 회원님 로그인 하셨습니다
<input type="submit" value="로그아웃">
</form>

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
	<input type="button" class="btn btn-dark" value="글쓰기" onclick="location.href='write.jsp'">
	<!-- 기존 버튼에 class="btn btn-dark" 추가해준 거임 -->
	<!-- 우리가 <div class="container" style="padding-top: 50px;"> 이걸 추가했잖아 -->
	<button type="button" class="btn btn-dark" onclick="location.href='write.jsp'">글쓰기</button>
	
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>
