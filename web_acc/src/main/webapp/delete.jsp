<%@page import="dao.AccDao"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

AccDao dao = AccDao.getInstance();

int num = Integer.parseInt(request.getParameter("num"));

dao.delete(num);

response.sendRedirect("myCalendar.jsp");
%>
