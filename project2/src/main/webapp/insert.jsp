<%@page import="dto.newBoard"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.time.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

// 양식에 입력되었던 값 읽기

String writer = request.getParameter("writer");
String title = request.getParameter("title");
String content = request.getParameter("content");

// 빈 칸이 하나라도 있으면 오류 출력하고 종료
if (title == null || title.length() == 0 || content == null
		|| content.length() == 0) {
%>
<script>
	alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
	history.back();
</script>
<%
return;
}

// 입력된 내용으로 새 글 레코드 추가
BoardDao dao = BoardDao.getInstance();
newBoard newboard = new newBoard(title, content, 1);


dao.insert(newboard);

response.sendRedirect("list.jsp");
%>