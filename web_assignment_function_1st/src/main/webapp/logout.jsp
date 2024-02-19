<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
session.removeAttribute("member");
response.addCookie(Cookies.createCookie("CKHIT", "", "/", 0));
response.addCookie(Cookies.createCookie("MEMBERLOG", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT1", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT2", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT3", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT4", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT5", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT6", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT7", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT8", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT9", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT10", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT11", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT12", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT13", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT14", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT15", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT16", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT17", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT18", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT19", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT20", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT21", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT22", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT23", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT24", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT25", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT26", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT27", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT28", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT29", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT30", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT31", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT32", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT33", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT34", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT35", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT36", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT37", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT38", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT39", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT40", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT41", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT42", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT43", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT44", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT45", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT46", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT47", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT48", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT49", "", "/", 0));
response.addCookie(Cookies.createCookie("LIKEIT50", "", "/", 0));
response.sendRedirect("login_main.jsp"); // 로그인 메인 화면으로
%>
