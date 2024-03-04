<%@page import="util.Cookies"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.time.*"%>
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
Cookies cookies = new Cookies(request);
%>
<%
request.setCharacterEncoding("utf-8");

int num = Integer.parseInt(request.getParameter("num"));

String writer = request.getParameter("writer");
String title = request.getParameter("title");
String content = request.getParameter("content");

if (cookies.exists("ADMIN") && cookies.getValue("ADMIN").equals("admin")) {

	String adminPrefix = "(관리자에 의해 수정된 글입니다) ";
	if (!title.startsWith(adminPrefix)) {
		title = adminPrefix + title;
	}
}
if (writer == null || writer.length() == 0 || title == null || title.length() == 0) {
%>

<script>
	alert('업데이트 항목을 입력해주세요');
	history.back();
</script>

<%
return;
}
BoardDao dao = BoardDao.getInstance();
Board board = new Board(num, writer, title, content);
dao.update(board, false);
%>
<%
response.sendRedirect("view.jsp?num=" + num);
%>

