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
	response.sendRedirect("../index.html");
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
					<li class="nav-item"><a class="nav-link active" aria-current="page" href="../index.html">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="../_navi/notice.jsp">Notice</a></li>
					<li class="nav-item"><a class="nav-link" href="../_navi/hot.jsp">Hot</a></li>
					<li class="nav-item"><a class="nav-link" href="list.jsp">List</a></li>
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

	String writer = request.getParameter("writer");
	BoardDao dao = BoardDao.getInstance();

	int pagenow = 1; // 현재 페이지 번호, 기본값은 1
	int pageSize = 5; // 페이지당 글 수
	if (request.getParameter("pagenow") != null) {
		pagenow = Integer.parseInt(request.getParameter("pagenow"));
	}

	// 전체 글 수 조회
	int totalPosts = dao.selectListNum(writer); // getTotalPosts()는 전체 글 수를 반환하는 메소드

	// 전체 페이지 수 계산
	int totalPages = totalPosts / pageSize;
	if (totalPosts % pageSize > 0) {
		totalPages++;
	}

	List<Board> list = dao.selectList(pagenow, pageSize, writer);
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
				</tr>
			</thead>

			<tbody class="table-group-divider">
				<%
				for (Board board : list) {
				%>
				<tr>
					<th scope="row"><%=board.getNum()%></th>
					<td style="text-align: left;"><a
						href="view.jsp?num=<%=board.getNum()%>"> <%=board.getTitle()%></a></td>
					<td><a href="list_one.jsp?writer=<%=board.getWriter()%>"><%=board.getWriter()%></a></td>
					<td><%=board.getRegtime()%></td>
					<td><%=board.getHits()%></td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
		<div class="d-flex justify-content-end mt-2">
		<button type="button" class="btn btn-dark"
				onclick="location.href='list.jsp'">목록으로</button> &nbsp;
			<button type="button" class="btn btn-dark"
				onclick="location.href='write.jsp'">글쓰기</button>
		</div>
	</div>

	<nav aria-label="Page navigation"
		class="d-flex justify-content-center mt-4">
		<ul class="pagination">
			<%
			int pagenowc = 1; // 기본값 설정
			if (request.getParameter("pagenowc") != null) {
				pagenowc = Integer.parseInt(request.getParameter("pagenowc"));
			}

			for (int i = 1; i <= totalPages; i++) {
			%>
			<li class="page-item"><a class="page-link text-black"
				href="list_one.jsp?pagenow=<%=i%>&pagenowc=<%=pagenowc%>&writer=<%=writer %>"><%=i%></a></li>
			<%
			}
			%>
		</ul>
	</nav>

	<%
	CommenDao daocom = CommenDao.getInstance();

	pagenowc = 1; // 현재 페이지 번호, 기본값은 1
	int pageSizec = 5; // 페이지당 글 수
	if (request.getParameter("pagenowc") != null) {
		pagenowc = Integer.parseInt(request.getParameter("pagenowc"));
	}

	// 전체 글 수 조회
	int totalPostsc = daocom.selectListNum(writer); // getTotalPosts()는 전체 글 수를 반환하는 메소드

	// 전체 페이지 수 계산
	int totalPagesc = totalPostsc / pageSizec;
	if (totalPostsc % pageSizec > 0) {
		totalPagesc++;
	}

	List<Commen> list2 = daocom.selectList(pagenowc, pageSizec, writer);
	%>

	<div class="container" style="padding-top: 50px;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">작성자</th>
					<th scope="col">댓글 내용</th>
				</tr>
			</thead>

			<tbody class="table-group-divider">
				<%
				for (Commen commen : list2) {
				%>
				<tr>
					<th scope="row"><a
						href="list_one.jsp?writer=<%=commen.getWriter()%>"><%=commen.getWriter()%></a></th>
					<td><%=commen.getContent()%></td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
		<div class="d-flex justify-content-end mt-2">
		<button type="button" class="btn btn-dark"
				onclick="location.href='list.jsp'">목록으로</button>
		</div>
	</div>

	<nav aria-label="Page navigation"
		class="d-flex justify-content-center mt-4">
		<ul class="pagination">
			<%
			for (int i = 1; i <= totalPagesc; i++) {
			%>
			<li class="page-item"><a class="page-link text-black"
				href="list_one.jsp?pagenowc=<%=i%>&pagenow=<%=pagenow%>&writer=<%=writer %>"><%=i%></a></li>
			<%
			}
			%>
		</ul>
	</nav>
</body>
</html>
