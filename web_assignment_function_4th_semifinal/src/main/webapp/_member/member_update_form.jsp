<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

Member member = (Member) session.getAttribute("member");
MemberDao.getInstance().select(member.getId());
%>

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

	

	<div class="centered-form">
		<form id="frm" method="post" class="form-signin">
			<h1 class="h3 mb-3 fw-normal">회원 정보 수정</h1>

			<div>
				<input type="text" name="id" class="form-control" id="floatingInput"
					value="<%=member.getId()%>" readonly>
			</div>
			<br>

			<div>
				<input type="text" name="email" class="form-control"
					id="floatingPassword" value="<%=member.getEmail()%>">
			</div>
			<br>

			<div>
				<input type="text" name="name" class="form-control"
					id="floatingName" value="<%=member.getName()%>">
			</div>

			<div class="form-buttons">
				<button class="btn btn-dark btn-lg py-2" type="submit"
					onclick="update()">확인</button>
				<button class="btn btn-secondary py-2" type="submit"
					onclick="window.close();">취소</button>

				<button class="btn btn-danger btn-sm py-2" type="submit"
					onclick="del()">회원 탈퇴</button>
			</div>
		</form>
	</div>
	<script>
		function update() {
			document.querySelector('#frm').action = 'member_update.jsp';
			document.querySelector('#frm').submit();
		}
		function del() {
			/* delete는 자바스크립트의 예약어라서 사용 불가능 */
			document.getElementById('frm').action = 'member_delete.jsp';
			document.getElementById('frm').submit();
		}
	</script>
</body>
</html>