<%@ page import="dto.Acc"%>
<%@ page import="dao.AccDao"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

int year = Integer.parseInt(request.getParameter("year"));
int month = Integer.parseInt(request.getParameter("month"));
int day = Integer.parseInt(request.getParameter("day"));
String trname = request.getParameter("trname");
String dlname = request.getParameter("dlname");
String mulname = request.getParameter("mulname");

AccDao dao = AccDao.getInstance();

Acc acc = new Acc(day, month, year, trname, dlname, mulname);
int result = dao.insert(acc);
if (result > 0) {
%>
<script>
	alert('INSERT 성공');
	opener.location.reload(true);
	window.close();
</script>
<%
} else {
%>
<script>
	alert('INSERT 실패');
	window.close();
</script>
<%
}
%>
