<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
String memberId = (String) session.getAttribute("MEMBERID");
if (memberId == null) {
	response.sendRedirect("sessionLoginForm.jsp");
}
BoardDao dao = BoardDao.getInstance();
%>
<%
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));

dao.delete(num);
// 만약에 BoardDao의 delete 메소드의 리턴값을 사용하고 싶으면 int result = dao.delete(num); 등으로 받아서 if-else 쓰면 됩니다
%>
<%
/* if(){ */
	

%>
<script>
alert("삭제되었습니다.");
location.href="list.jsp";
/* history.go(-1); */
</script>
<%
/* } */
%>

<%
// 목록보기 화면으로 돌아감
response.sendRedirect("list.jsp");
%>