<%@ page import="dao.CommenDao"%>
<%@ page import="dto.Commen"%>
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
	response.sendRedirect("../index.html");
	return;
}

request.setCharacterEncoding("utf-8");

int num = Integer.parseInt(request.getParameter("num"));
String writer = request.getParameter("writer");
String content = request.getParameter("content");

if (writer == null || writer.length() == 0 || content == null
		|| content.length() == 0) {
%>
<script>
	alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
	history.back();
</script>
<%
return;
}

CommenDao dao = CommenDao.getInstance();
Commen commen = new Commen(num, writer, content);
int result = dao.update(commen, false);
if(result==1){
	%>
	<script>
alert('댓글이 성공적으로 수정되었습니다.');
window.opener.location.reload(); // 부모 창(원래 페이지)을 새로고침
window.close(); // 현재 팝업 창 닫기
</script>
	<%
} else {
%>
<script>
window.close(); // 현재 팝업 창 닫기
</script>
<%
}
%>
