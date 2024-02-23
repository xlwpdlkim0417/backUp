<%@ page import="dao.CommenDao"%>
<%@ page import="dto.Commen"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
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

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.blog-post textarea {
	width: 100%; /* 너비를 부모 요소의 100%로 설정 */
	box-sizing: border-box; /* 패딩과 테두리를 너비에 포함시킴 */
	margin-top: 1rem; /* 위쪽 마진 설정 */
	margin-bottom: 1rem; /* 아래쪽 마진 설정 */
}

.blog-post .display-5 {
	margin-top: 2rem; /* 상단에서 2rem 만큼 떨어트림 */
}
</style>
</style>
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
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

				<form class="d-flex" action="../_member/logout.jsp" method="post">
					<input class="form-control me-2" type="text"
						value="<%=member.getName()%>님 로그인을 환영" readonly> <input
						type="submit" value="로그아웃"> &nbsp; <input type="button"
						value="회원정보 수정"
						onclick="window.open('../_member/member_update_form.jsp', 'popup', 'width=600, height=300')">
				</form>
			</div>
		</div>
	</nav>
	<%
	request.setCharacterEncoding("utf-8");

	String tmp = request.getParameter("num");
	int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;

	String writer = "";
	String content = "";
	String action = "insert_comment.jsp";

	if (num > 0) {
		CommenDao dao = CommenDao.getInstance();
		Commen commen = dao.selectOne(num, false);

		writer = commen.getWriter();
		content = commen.getContent();

		action = "update_comment.jsp?num=" + num;
	}
	%>


	<form method="post" action="<%=action%>">
		<div class="d-flex justify-content-center">
			<div class="col-md-8">
				<article class="blog-post">
					<div class="d-flex justify-content-end">
						<p class="blog-post-meta">
							by
							<%=member.getName()%>
							<input type="hidden" name="writer" maxlength="20"
								value="<%=member.getName()%>" readonly>
						</p>
					</div>
					<hr>
					<p>
						<textarea name="content" rows="10"><%=content%></textarea>
					</p>
					<hr>
					<div class="d-flex justify-content-end">
						<input type="button" class="btn btn-secondary" value="취소"
							onclick="window.close();">
					</div>
					<div class="d-flex justify-content-center">
						<input type="submit" class="btn btn-dark btn-lg" value="저장">
					</div>

				</article>
			</div>
		</div>
	</form>
</body>
</html>
