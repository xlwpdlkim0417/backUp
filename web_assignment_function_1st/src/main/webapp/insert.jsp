<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.time.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("login_main.jsp");
}

String writer = request.getParameter("writer");
String title = request.getParameter("title");
String content = request.getParameter("content");

if (writer == null || writer.length() == 0 || title == null || title.length() == 0 || content == null
		|| content.length() == 0) {
%>

<script>
	alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
	history.back();
</script>

<%
return;
}
BoardDao dao = BoardDao.getInstance();
Board board = new Board(writer, title, content);
dao.insert(board);
response.sendRedirect("list.jsp");
%>