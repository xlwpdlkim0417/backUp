<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>기업형 웹 페이지</title>
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
				<li><a href="#">Login</a></li>
				<li><a href="#">Join</a></li>
				<li><a href="#">Sitemap</a></li>
			</ul>
		</div>
	</header>
	<figure>
		<%@ page import="dao.MemberDao"%>
		<%@ page import="dto.Member"%>
		<%@ page language="java" contentType="text/html; charset=UTF-8"
			pageEncoding="UTF-8"%>

		<%
		request.setCharacterEncoding("utf-8");
		%>

		<%
		Member member = (Member) session.getAttribute("member");
		if (member != null) {
			response.sendRedirect("list.jsp");
		} else {
		%>

		<form action="login.jsp" method="post">
			아이디: <input type="text" name="id"> <br> 이메일: <input
				type="text" name="pw"> <br> <input type="submit"
				value="로그인"> <input type="button" value="회원가입"
				onclick="window.open('member_join_form.jsp', 'popup', 'width=600, height=300')">
		</form>

		<%
		}
		%>
	</figure>
</body>
</html>
