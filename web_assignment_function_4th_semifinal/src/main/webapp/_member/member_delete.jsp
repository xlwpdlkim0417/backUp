<%@ page import="util.Cookies"%>
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
<%
request.setCharacterEncoding("utf-8");

MemberDao dao = MemberDao.getInstance();

String id = request.getParameter("id");

int result = dao.delete(member);

if (result == 1) {
	session.removeAttribute("member");
	response.addCookie(Cookies.createCookie("MEMBERLOG", "", "/", 0));
%>

<script>
	alert('회원 탈퇴 완료');
	window.opener.location.href = "../index.html"; // 부모 창을 다른 페이지로 이동
	window.close(); // 현재 팝업 창 닫기
</script>

<%
} else {
%>

<script>
	alert('회원 탈퇴 실패');
	window.close();
</script>

<%
}
%>