<%@ page import="util.Cookies"%>
<%@ page import="dao.CommenDao"%>
<%@ page import="dto.Commen"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
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
<%
Cookies cookies = new Cookies(request);
%>
<%
BoardDao dao = BoardDao.getInstance();
CommenDao daocom = CommenDao.getInstance();
%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>View</title>
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
						aria-current="page" href="../index.html">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="../_navi/notice.jsp">Notice</a></li>
					<li class="nav-item"><a class="nav-link"
						href="../_navi/hot.jsp">Hot</a></li>
					<li class="nav-item"><a class="nav-link" href="list.jsp">List</a></li>
					<%
					if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
					%>
					<li class="nav-item"><a class="nav-link"
						href="../_navi/member.jsp">Member</a></li>
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

	int num = Integer.parseInt(request.getParameter("num"));

	String writer = "";
	String title = "";
	String content = "";
	String regtime = "";
	int hits = 0;
	int likes = 0;
	String commentwriter = request.getParameter("commentwriter");
	String commentcontent = request.getParameter("commentcontent");
	boolean inc = false;

	List<Commen> list = daocom.selectListOne(num);

	if (cookies.exists("MEMBERLOG") && cookies.getValue("MEMBERLOG").equals(dao.selectOneDelete(num).getWriter())) {
		inc = false;
	} else {
		inc = true;
	}
	Board board = dao.selectOne(num, inc);

	writer = board.getWriter();
	title = board.getTitle();
	content = board.getContent();
	regtime = board.getRegtime();
	hits = board.getHits();
	likes = board.getLikes();

	title = title.replace(" ", "&nbsp;");
	if (content == null || content.equals("null")) {
		content = "\n";
	}
	content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
	%>

	<div class="d-flex justify-content-center">
		<div class="col-md-10">
			<article class="blog-post">
				<h2
					class="d-flex justify-content-center display-5 link-body-emphasis mb-1"><%=title%></h2>
				<div class="d-flex justify-content-end">
					<p class="blog-post-meta"><%=regtime%>
						by <a href="list_one.jsp?writer=<%=writer%>"><%=writer%></a>
					</p>
				</div>
				<div class="d-flex justify-content-end">
					<p class="blog-post-meta"><%=hits%>
						viewed /
						<%=likes%>
						liked
					</p>
				</div>
				<hr>
				<p><%=content%></p>
				<hr>

				<div class="d-flex justify-content-center">
					<%
					if (!cookies.exists("LIKEIT" + num)) {
					%>
					<img src="../img/hand-thumbs-up.svg" alt="좋아요"
						style="width: 30px; height: 30px;"
						onclick="location.href='likes.jsp?num=<%=num%>'">
					<%
					} else if (cookies.exists("LIKEIT" + num)) {
					%>
					<img src="../img/hand-thumbs-up-fill.svg" alt="좋아요"
						style="width: 30px; height: 30px;"
						onclick="location.href='likes.jsp?num=<%=num%>'">
					<%
					}
					%>
				</div>

				<div class="d-flex justify-content-end">
					<input type="button" class="btn btn-dark" value="목록보기"
						onclick="location.href='list.jsp'"> &nbsp;
					<%
					if (member.getId().equals(dao.selectOneDelete(num).getWriter())
							|| cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {
					%>
					<input type="button" class="btn btn-dark" value="수정"
						onclick="location.href='write.jsp?num=<%=num%>'"> &nbsp; <input
						type="button" class="btn btn-dark" value="삭제"
						onclick="location.href='delete.jsp?num=<%=num%>'">
					<%
					}
					%>
				</div>

				<h6>댓글</h6>

				<form method="post" action="../_comment/insert_comment.jsp">
					<input type="hidden" name="num" maxlength="20" value="<%=num%>">
					<input type="hidden" name="commentwriter" maxlength="20" value="<%=member.getId()%>" readonly> <br>
					<div class="input-group">
						<span class="input-group-text"><%=member.getId()%></span>
						<textarea class="form-control" name="commentcontent" rows="1"></textarea>
						<input type="submit" class="btn btn-outline-secondary" value="등록">
					</div>
				</form>

				<%
				int pagenow = 1;
				int pageSize = 5;
				if (request.getParameter("pagenow") != null) {
					pagenow = Integer.parseInt(request.getParameter("pagenow"));
				}

				int totalPosts = daocom.selectListNum(num);

				int totalPages = totalPosts / pageSize;
				if (totalPosts % pageSize > 0) {
					totalPages++;
				}

				List<Commen> list2 = daocom.selectList(pagenow, pageSize, num);
				%>

				<div class="container" style="padding-top: 50px;">
					<table class="table table-hover">
						<tbody>
							<%
							for (Commen commen : list2) {
							%>
							<input type="hidden" name="ghost" maxlength="20"
								value="<%=commen.getGhost()%>" readonly>
							<input type="hidden" name="num" maxlength="20" value="<%=num%>"
								readonly>
							<tr>
								<th scope="row"><a
									href="list_one.jsp?writer=<%=commen.getWriter()%>"><%=commen.getWriter()%></a></th>
								<td><%=commen.getContent().replace(" ", "&nbsp;").replace("\n", "<br>")%>
								</td>
								<%
								if (member.getId().equals(commen.getWriter())) {
								%>
								<td class="text-end"><input type="button"
									class="btn btn-secondary btn-sm" value="수정"
									style="margin-right: 5px; padding: 5px 10px;"
									onclick="openCenteredWindow('../_comment/write_comment.jsp?num=<%=num%>', 900, 600)">
									<input type="button" class="btn btn-secondary btn-sm"
									value="삭제" style="padding: 5px 10px;"
									onclick="location.href='../_comment/delete_comment.jsp?num=<%=num%>&ghost=<%=commen.getGhost()%>'">
								</td>
								<%
								} else if (cookies.exists("ADMIN") && (cookies.getValue("ADMIN").equals("admin"))) {
								%>
								<td class="text-end"><input type="button"
									class="btn btn-secondary btn-sm" value="수정"
									style="margin-right: 5px; padding: 5px 10px;"
									onclick="openCenteredWindow('../_comment/write_comment.jsp?num=<%=num%>', 900, 600)">
									<input type="button" class="btn btn-secondary btn-sm"
									value="삭제" style="padding: 5px 10px;"
									onclick="location.href='../_comment/delete_comment.jsp?num=<%=num%>&ghost=<%=commen.getGhost()%>'">
								</td>
								<%
								}
								%>
							</tr>
						</tbody>
						<%
						}
						%>
					</table>
				</div>

				<nav aria-label="Page navigation"
					class="d-flex justify-content-center mt-4">
					<ul class="pagination">
						<%
						for (int i = 1; i <= totalPages; i++) {
						%>
						<li class="page-item"><a class="page-link text-black"
							href="view.jsp?pagenow=<%=i%>&num=<%=num%>"><%=i%></a></li>
						<%
						}
						%>
					</ul>
				</nav>
			</article>
		</div>
	</div>

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
