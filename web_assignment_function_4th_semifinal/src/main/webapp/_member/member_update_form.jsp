<%@ page import="util.Cookies"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("../index.html");
	return;
}
%>
<%
Cookies cookies = new Cookies(request);
%>
<%
request.setCharacterEncoding("utf-8");

MemberDao.getInstance().select(member.getId());
%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Member Update</title>
<link rel="icon" href="../favicon.ico" type="image/x-icon" />
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

	<%
	String id = request.getParameter("id");
	String email = request.getParameter("email");
	String name = request.getParameter("name");
	%>


	<div class="centered-form">
		<form id="frm" method="post" class="form-signin">
			<h1 class="h3 mb-3 fw-normal">회원 정보 수정</h1>

			<div>
				<%
				if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
				%>
				<input type="text" name="id" class="form-control" id="floatingInput"
					value="<%=id%>">
				<%
				} else {
				%>
				<input type="text" name="id" class="form-control" id="floatingInput"
					value="<%=member.getId()%>" readonly>
				<%
				}
				%>
			</div>
			<br>

			<div>
				<%
				if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
				%>
				<input type="text" name="email" class="form-control"
					id="floatingPassword" value="<%=email%>">
				<%
				} else {
				%>
				<input type="text" name="email" class="form-control"
					id="floatingPassword" value="<%=member.getEmail()%>">
				<%
				}
				%>
			</div>
			<br>

			<div>
				<%
				if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
				%>
				<input type="text" name="name" class="form-control"
					id="floatingName" value="<%=name%>">
				<%
				} else {
				%>
				<input type="text" name="name" class="form-control"
					id="floatingName" value="<%=member.getName()%>">
				<%
				}
				%>
			</div>
			<div class="form-buttons">
				<button class="btn btn-dark btn-lg py-2" type="submit"
					onclick="update()">확인</button>
				<button class="btn btn-secondary py-2" type="submit"
					onclick="window.close();">취소</button>
				<button class="btn btn-danger btn-sm py-2" type="submit"
					onclick="del()">회원 삭제</button>
			</div>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
		
	</script>
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