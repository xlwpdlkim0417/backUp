<%@ page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Member Join</title>
<link rel="icon" href="../favicon.ico" type="image/x-icon" />
<style>
body, html {
	height: 100%;
	margin: 0;
	padding: 0;
}

.centered-form {
	display: flex;
	justify-content: center;
	height: 100%;
}

.form-signin {
	width: 100%;
	max-width: 330px;
	padding: 15px;
	margin-top: 0;
}

.form-buttons {
	width: 100%;
	display: flex;
	flex-direction: column;
	gap: 10px;
	margin-top: 40px;
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

	<div class="centered-form">
		<form action="member_join.jsp" method="post" class="form-signin">
			<h1 class="h3 fw-normal">회원 가입</h1>
			<div>
				<label>아이디</label> <input type="text" name="id" class="form-control"
					id="floatingInput">
			</div>
			<br>
			<div>
				<label>이메일</label> <input type="text" name="email"
					class="form-control" id="floatingPassword">
			</div>
			<br>
			<div>
				<label>이름</label> <input type="text" name="name"
					class="form-control" id="floatingName">
			</div>
			<div class="form-buttons">
			
				<button class="btn btn-dark btn-lg py-2" type="submit">확인</button>
				<button class="btn btn-secondary py-2" type="submit"
					onclick="window.close();">취소</button>
			</div>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
		
	</script>
</body>
</html>
