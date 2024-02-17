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

dao.delete(num);
// 만약에 BoardDao의 delete 메소드의 리턴값을 사용하고 싶으면 int result = dao.delete(num); 등으로 받아서 if-else 쓰면 됩니다
%>
<%
%>
<script>
alert("삭제되었습니다.");
location.href="list.jsp";
/* history.go(-1); */
</script>
<%
%>
<%
response.sendRedirect("list.jsp");
%>