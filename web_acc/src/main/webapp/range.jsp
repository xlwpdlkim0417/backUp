<%@page import="java.util.List"%>
<%@ page import="dto.Acc"%>
<%@ page import="dao.AccDao"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

AccDao dao = AccDao.getInstance();

int startYear = Integer.parseInt(request.getParameter("startYear"));
int startMonth = Integer.parseInt(request.getParameter("startMonth"));
int startDay = Integer.parseInt(request.getParameter("startDay"));
int endYear = Integer.parseInt(request.getParameter("endYear"));
int endMonth = Integer.parseInt(request.getParameter("endMonth"));
int endDay = Integer.parseInt(request.getParameter("endDay"));

List<Acc> list = dao.selectByDateRange(startYear, startMonth, startDay, endYear, endMonth, endDay);
%>
<div style="text-align: center;">
	<%
	// 현재 날짜에 해당하는 Acc 데이터 찾기
	for (Acc acc : list) {
		String trName = acc.getTrname();
		String mulName = acc.getMulname();
		int count = acc.getCount();

		out.println("<div>" + mulName + " - " + trName + ": " + count + "</div>");
	}
	%>
</div>
