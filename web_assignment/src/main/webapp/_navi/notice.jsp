<%@ page import="util.Cookies"%>
<%@ page import="dao.CommenDao"%>
<%@ page import="dto.Commen"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("../index.jsp");
	return;
}
%>
<%
Cookies cookies = new Cookies(request);
%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Notice</title>
<link rel="icon" href="../favicon.ico" type="image/x-icon" />
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
			<a class="navbar-brand">Board</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="../index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="notice.jsp">Notice</a></li>
					<li class="nav-item"><a class="nav-link" href="hot.jsp">Hot</a></li>
					<li class="nav-item"><a class="nav-link" href="../_board/list.jsp">List</a></li>
					<%
					if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
					%>
					<li class="nav-item"><a class="nav-link" href="member.jsp">Member</a></li>
					<%
					}
					%>
				</ul>
				<form class="d-flex" action="../_member/logout.jsp" method="post">
					<input class="form-control me-2" type="hidden"
						value="<%=member.getId()%>" readonly>
					<div style="color: white; display: flex; align-items: center;">
						<%=member.getId()%>님 로그인을 환영합니다
					</div>
					&nbsp; &nbsp; <input type="submit" value="로그아웃"> &nbsp;
					&nbsp;
					<%
					if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
					%>
					<input type="button" value="회원정보 수정"
						onclick="openCenteredWindow('../_member/member_update_form_admin.jsp', '800', '600')">
					<%
					} else {
					%>
					<input type="button" value="회원정보 수정"
						onclick="openCenteredWindow('../_member/member_update_form.jsp', '800', '600')">
					<%
					}
					%>
				</form>
			</div>
		</div>
	</nav>

	<%
	request.setCharacterEncoding("utf-8");
	BoardDao dao = BoardDao.getInstance();

	int pagenow = 1;
	int pageSize = 10;
	if (request.getParameter("pagenow") != null) {
		pagenow = Integer.parseInt(request.getParameter("pagenow"));
	}

	int totalPosts = dao.selectListNumNotice();

	int totalPages = totalPosts / pageSize;
	if (totalPosts % pageSize > 0) {
		totalPages++;
	}

	List<Board> list = dao.selectListNotice(pagenow, pageSize);
	%>

	<div class="container" style="padding-top: 50px;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">번호</th>
					<th scope="col">제목</th>
					<th scope="col">작성자</th>
					<th scope="col">작성일시</th>
					<th scope="col">조회수</th>
					<th scope="col">좋아요</th>
				</tr>
			</thead>
			<tbody class="table-group-divider">
				<%
				for (Board board : list) {
				%>
				<tr>
					<th scope="row"><%=board.getNum()%></th>
					<td style="text-align: left;"><a
						href="../_board/view.jsp?num=<%=board.getNum()%>"> <%=board.getTitle()%></a></td>
					<td><%=board.getWriter()%></td>
					<td><%=board.getRegtime()%></td>
					<td><%=board.getHits()%></td>
					<td><%=board.getLikes()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<div class="d-flex justify-content-end mt-2">
			<button type="button" class="btn btn-dark"
				onclick="location.href='../_board/list.jsp'">목록으로</button>
		</div>
	</div>

	<nav aria-label="Page navigation"
		class="d-flex justify-content-center mt-4">
		<ul class="pagination">
			<%
			for (int i = 1; i <= totalPages; i++) {
			%>
			<li class="page-item"><a class="page-link text-black"
				href="../_board/list.jsp?pagenow=<%=i%>"><%=i%></a></li>
			<%
			}
			%>
		</ul>
	</nav>

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
