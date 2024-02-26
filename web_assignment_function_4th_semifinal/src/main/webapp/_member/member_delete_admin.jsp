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
	%>
	<script>
alert('회원 계정 삭제');
response.sendRedirect("../_navi/member.jsp");
</script>

<%	
} else{
%>
<script>
alert('회원 계정 삭제 실패 개발자에게 문의 주셈');
response.sendRedirect("../_navi/member.jsp");
</script>
<%

}


%>