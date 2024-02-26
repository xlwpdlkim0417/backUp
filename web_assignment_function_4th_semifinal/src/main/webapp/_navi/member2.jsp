<%@page import="util.Cookies"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
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

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>List</title>
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
					<li class="nav-item"><a class="nav-link" href="../_navi/temp.jsp">Temporary</a></li>
					<li class="nav-item"><a class="nav-link" href="../_navi/member.jsp">Member</a></li>

					
					<li class="nav-item"><a class="nav-link disabled"
						aria-disabled="true">Disabled</a></li>
				</ul>

				<form class="d-flex" action="../_member/logout.jsp" method="post">
					<input class="form-control me-2" type="hidden" value="<%=member.getName()%>" readonly>
					<div style="color: white; display: flex; align-items: center;" >
    				<%= member.getName() %>님 로그인을 환영합니다
					</div> &nbsp;
					<input type="submit" value="로그아웃"> &nbsp;
					<input type="button" value="회원정보 수정"
						onclick="openCenteredWindow('../_member/member_update_form.jsp', '800', '600')">
				</form>
			</div>
		</div>
	</nav>
	<%
	request.setCharacterEncoding("utf-8");
	MemberDao dao = MemberDao.getInstance();

	int pagenow = 1; // 현재 페이지 번호, 기본값은 1
	int pageSize = 5; // 페이지당 글 수
	if (request.getParameter("pagenow") != null) {
		pagenow = Integer.parseInt(request.getParameter("pagenow"));
	}

	// 전체 글 수 조회
	int totalPosts = dao.selectListNum(); // getTotalPosts()는 전체 글 수를 반환하는 메소드

	// 전체 페이지 수 계산
	int totalPages = totalPosts / pageSize;
	if (totalPosts % pageSize > 0) {
		totalPages++;
	}

	List<Member> list = dao.selectList(pagenow, pageSize);
	%>
	<div class="container" style="padding-top: 50px;">
	
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">EMAIL</th>
					<th scope="col">NAME</th>
					
				</tr>
			</thead>

			<tbody class="table-group-divider">
			
				<%
				for (Member member2 : list) {
				%>
				
				<tr>
					<th scope="row"><%=member2.getId()%></th>
					<td><%=member2.getEmail()%></td>
					<td><%=member2.getName()%></td>
					<form id="frm" method="get">
					<input type="hidden" name="id" value="<%=member2.getId()%>">
					<input type="hidden" name="email" value="<%=member2.getEmail()%>">
					<input type="hidden" name="name" value="<%=member2.getName()%>">				
					<td class="text-end">
					<button type="submit" class="btn btn-secondary btn-sm" value="수정"
					style="margin-right: 5px; padding: 5px 10px;"
					onclick="openCenteredWindow('../_member/member_update_form_admin.jsp?id=<%=member2.getId()%>&email=<%=member2.getEmail()%>&name=<%=member2.getName()%>', '800', '600')">수정</button>

									<input type="button" class="btn btn-secondary btn-sm"
									value="삭제" style="padding: 5px 10px;"
									onclick="location.href='../_member/member_delete.jsp'">
								</td>
								<td>
								<div class="form-buttons">
				<button class="btn btn-dark btn-lg py-2" type="submit"
					onclick="update()">확인</button>
				<button class="btn btn-secondary py-2" type="submit"
					onclick="window.close();">취소</button>

				<button class="btn btn-danger btn-sm py-2" type="submit"
					onclick="del()">회원 탈퇴</button>
			</div>
								</td></form>
		
				</tr>
					
			</tbody>
			<%
			}
			%>
		</table>
	
		<div class="d-flex justify-content-end mt-2">
		<button type="button" class="btn btn-dark"
				onclick="location.href='../_board/list.jsp'">목록으로</button> &nbsp;
			<button type="button" class="btn btn-dark" onclick="location.href='../_board/write.jsp'">글쓰기</button>
			
		</div>
		<div class="d-flex justify-content-end mt-2">
			
		</div>
	</div>

	<nav aria-label="Page navigation"
		class="d-flex justify-content-center mt-4">
		<ul class="pagination">
			<%
			for (int i = 1; i <= totalPages; i++) {
			%>
			<li class="page-item"><a class="page-link text-black"
				href="member.jsp?pagenow=<%=i%>"><%=i%></a></li>
			<%
			}
			%>
		</ul>
	</nav>
	
	



	<br>
	<!-- <input type="button" class="btn btn-dark" value="글쓰기" onclick="location.href='write.jsp'"> -->
	<!-- <button type="button" class="btn btn-dark" value="글쓰기" onclick="location.href='write.jsp'">글쓰기</button> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
	

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
function update() {
	document.querySelector('#frm').action = '../_member/member_update_form_admin.jsp';
	document.querySelector('#frm').submit();
}
function del() {
	/* delete는 자바스크립트의 예약어라서 사용 불가능 */
	document.getElementById('frm').action = 'member_delete.jsp';
	document.getElenemtById('frm').submit();
}
</script>
</body>
</html>
