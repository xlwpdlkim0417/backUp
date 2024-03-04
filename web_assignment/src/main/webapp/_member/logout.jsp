<%@ page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
session.removeAttribute("member");
response.addCookie(Cookies.createCookie("MEMBERLOG", "", "/", 0));
response.addCookie(Cookies.createCookie("ADMIN", "", "/", 0));
response.sendRedirect("login_main.jsp");
%>