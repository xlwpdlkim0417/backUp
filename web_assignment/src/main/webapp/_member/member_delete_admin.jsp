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
	response.sendRedirect("../index.jsp");
	return;
}
%>
<%
request.setCharacterEncoding("utf-8");

MemberDao dao = MemberDao.getInstance();

String id = request.getParameter("id");

int result = dao.deletemember(id);

if (result == 1) {
%>

<script>
	alert('회원 계정 삭제 완료');
	opener.location.reload(true);
	window.close();
</script>

<%
} else {
%>

<script>
	alert('회원 계정 삭제 실패 개발자에게 문의주세요');
	opener.location.reload(true);
	window.close();
</script>

<%
}
%>