<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>List</title>
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
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Dropdown </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled"
						aria-disabled="true">Disabled</a></li>
				</ul>
			</div>
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
	Member member = (Member) session.getAttribute("member");
	if (member != null) {
		response.sendRedirect("../_board/list.jsp");
	} else {
	%>
	<div class="centered-form">
		<form action="login.jsp" method="post" class="form-signin">
			<img class="mb-4 centered-image" src="../img/chat-quote.svg" alt=""
				width="200" height="200">
			<h1 class="h3 mb-3 fw-normal">로그인</h1>

			<div class="form-floating">
				<input type="text" name="id" class="form-control" id="floatingInput"
					placeholder="ID"> <label for="floatingInput">ID</label>
			</div>
			<div class="form-floating">
				<input type="text" name="pw" class="form-control"
					id="floatingPassword" placeholder="name@example.com"> <label
					for="floatingPassword">Email Address</label>
			</div>
			<div class="form-buttons">
				<button class="btn btn-dark btn-lg py-2" type="submit"
					onclick="location.href=login.jsp">로그인</button>
				<button class="btn btn-dark btn-lg py-2" type="submit"
					onclick="openCenteredWindow('member_join_form.jsp', '800', '600')">회원가입</button>
			</div>
			<p class="mt-5 mb-3 text-body-secondary">&copy; 2023-2024</p>
		</form>
	</div>
	<%
	}
	%>



	<script>
function openCenteredWindow(url, width, height) {
    // 스크린 사이즈에서 팝업을 가운데 위치시키기 위한 계산
    var left = (window.screen.width / 2) - (width / 2);
    var top = (window.screen.height / 2) - (height / 2);

    // 팝업 창 설정
    var windowFeatures = 'width=' + width + ',height=' + height + ',top=' + top + ',left=' + left + ',resizable=yes';

    // 팝업 창 열기
    window.open(url, 'popup', windowFeatures);
}
</script>
</body>
</html>
