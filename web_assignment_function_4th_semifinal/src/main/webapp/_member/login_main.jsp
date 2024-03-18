<!doctype html>
<%@page import="util.Cookies"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="../favicon.ico" type="image/x-icon" />
<title>Login Main</title>
<style>
body, html {
	height: 100%;
	margin: 0;
	padding: 0; /* 추가: padding 초기화 */
}

.centered-form {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.form-signin {
	width: 100%;
	max-width: 330px;
	padding: 15px;
	margin-top: 0;
}

.form-buttons {
	width: 100%; /* 버튼 너비를 폼 너비에 맞춤 */
	display: flex;
	flex-direction: column;
	gap: 10px; /* 버튼 사이의 간격 */
	margin-top: 40px; /* 입력칸과 버튼 사이의 간격을 더 늘림 */
}

.centered-image {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.3/examples/sign-in/">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand">Board</a>
		</div>
	</nav>

	<%@ page import="dao.MemberDao"%>
	<%@ page import="dto.Member"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<%
	request.setCharacterEncoding("utf-8");
	%>

	<%
	Cookies cookies = new Cookies(request);
	%>
	
	<%
	Member member = (Member) session.getAttribute("member");
	if (member != null) {
		response.sendRedirect("../_board/list.jsp");
	} else {
	%>
	<div class="centered-form">
		<form action="login.jsp" method="post" class="form-signin">
			<img class="mb-4 centered-image" src="/img/chat-quote.svg" alt="" width="200" height="200">
			<h1 class="h3 mb-3 fw-normal">로그인</h1>

			<div class="form-floating">
				<input type="text" name="id" class="form-control" id="floatingInput" placeholder="ID">
				<label for="floatingInput">ID</label>
			</div>
			<div class="form-floating">
				<input type="text" name="pw" class="form-control" id="floatingPassword" placeholder="name@example.com">
				<label for="floatingPassword">Email Address</label>
			</div>
			
			<div class="form-buttons">
				<button class="btn btn-dark btn-lg py-2" type="submit">로그인</button>
				<button class="btn btn-dark btn-lg py-2" type="submit"
					onclick="openCenteredWindow('member_join_form.jsp', '800', '600')">회원가입</button>
				<button class="btn btn-secondary btn-lg py-2" type="button"
					onclick="location.href='../index.jsp'">돌아가기</button>

			</div>
			<p class="mt-5 mb-3 text-body-secondary">&copy; 2023-2024</p>
		</form>
	</div>
	<%
	}
	%>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
	</script>
	<script>
function openCenteredWindow(url, width, height) {
    var left = (window.screen.width / 2) - (width / 2);
    var top = (window.screen.height / 2) - (height / 2);
    var windowFeatures = 'width=' + width + ',height=' + height + ',top=' + top + ',left=' + left + ',resizable=yes';
    window.open(url, 'popup', windowFeatures);
}
</script>
</body>
</html>
