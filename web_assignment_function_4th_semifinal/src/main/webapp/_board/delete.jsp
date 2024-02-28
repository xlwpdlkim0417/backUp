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

BoardDao dao = BoardDao.getInstance();

int num = Integer.parseInt(request.getParameter("num"));

dao.delete(num);
%>

<script>
	alert("삭제되었습니다.");
	location.href = "list.jsp";
</script>