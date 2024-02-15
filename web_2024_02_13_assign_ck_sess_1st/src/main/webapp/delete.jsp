<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<%
request.setCharacterEncoding("utf-8");
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));
String writer = "";

// 지정된 글 번호의 레코드를 DB에서 삭제
Class.forName("com.mysql.cj.jdbc.Driver");
try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from board where num=" + num);) {
	if (rs.next()) {
		// 읽어들인 글 데이터를 변수에 저장
		writer = rs.getString("writer");
		if (session.getAttribute("MEMBERPW").equals(writer)) {
	stmt.executeUpdate("delete from board where num=" + num);
		} else {
%>
<script>
	alert("권한이 없습니다. 작성자만 삭제 할 수 있습니다.");
	history.go(-1);
</script>

<%
}

}
// 쿼리 실행

} catch (Exception e) {
e.printStackTrace();
}
if (session.getAttribute("MEMBERPW").equals(writer))
// 목록보기 화면으로 돌아감
response.sendRedirect("index.jsp");
%>