<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.time.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

// 전달받은 값 읽기
int num = Integer.parseInt(request.getParameter("num"));
String writer = request.getParameter("writer");
String title = request.getParameter("title");
String content = request.getParameter("content");

// 빈 칸이 하나라도 있으면 오류 출력하고 종료
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

// 입력된 내용으로 게시글 데이터 업데이트
BoardDao dao = BoardDao.getInstance();
Board board = new Board(num, writer, title, content);

dao.update(board);

// 글 보기 화면으로 돌아감
response.sendRedirect("view.jsp?num=" + num);
%>
