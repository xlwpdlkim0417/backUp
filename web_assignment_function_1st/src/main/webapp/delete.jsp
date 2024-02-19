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
// 지정된 글 번호 얻기
request.setCharacterEncoding("utf-8");
BoardDao dao = BoardDao.getInstance();

int num = Integer.parseInt(request.getParameter("num"));

if (member.getName().equals(dao.selectOneDelete(num).getWriter())) {
	
	dao.delete(num);
%>
<script>
	alert("삭제되었습니다.");
	location.href = "list.jsp";
	/* history.go(-1); */
</script>
<%
response.sendRedirect("list.jsp");
%>
<%
} else {
%>
<script>
	alert('작성자 only 삭제.');
	history.back();
</script>
<%
}
%>

