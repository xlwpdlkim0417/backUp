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
CommenDao dao = CommenDao.getInstance();
Cookies cookies = new Cookies(request);

int num = Integer.parseInt(request.getParameter("num"));

if (!cookies.exists("LIKEIT"+num)) {

	dao.like(num, member);
	response.addCookie(Cookies.createCookie("LIKEIT"+num, member.getName(), "/", 10));
%>
<%
response.sendRedirect("../_board/list.jsp");
%>
<%
} else if (cookies.exists("LIKEIT"+num)) {
%>
<script>
	alert('<좋아요>는 10초에 한 번 누를 수 있습니다 시험 때는 늘릴 겁니다');
	history.back();
</script>
<%
}
%>

