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

int num = Integer.parseInt(request.getParameter("num"));
int ghost = Integer.parseInt(request.getParameter("ghost"));

dao.deleteghost(ghost);

%>