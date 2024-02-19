<%@page import="util.Cookies"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("login_main.jsp");
}
%>
<%
request.setCharacterEncoding("utf-8");
BoardDao dao = BoardDao.getInstance();
Cookies cookies = new Cookies(request);

int num = Integer.parseInt(request.getParameter("num"));

if (!cookies.exists("LIKEIT"+num)) {

	dao.like(num, member);
	response.addCookie(Cookies.createCookie("LIKEIT"+num, member.getName(), "/", 60 * 60 * 24));
%>
<%
response.sendRedirect("list.jsp");
%>
<%
} else if (cookies.exists("LIKEIT"+num)) {
%>
<script>
	alert('좋아요는 하루에 한 번만 누를 수 있음 ㅅㄱ');
	history.back();
</script>
<%
}
%>

