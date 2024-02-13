<%@page import="java.sql.*"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String password = request.getParameter("password");

boolean login = false;
// MySQL 접속 후 로그인 체크
String sql = "select count(*) from board where num=? and writer =?";
Class.forName("com.mysql.cj.jdbc.Driver");

String num = "";
String writer = "";

try (// 괄호 내부 자원을 자동으로 닫아준다
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		PreparedStatement pstmt = conn.prepareStatement(sql);) {
	pstmt.setString(1, id);
	pstmt.setString(2, password);
	try (ResultSet rs = pstmt.executeQuery()) {
		rs.next();
		if (rs.getInt(1) == 1) {
	login = true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
} catch (Exception e) {
	e.printStackTrace();
}

if (login) {
	session.setAttribute("MEMBERID", id);
%>
<html>
<head>
<title>로그인성공</title>
</head>
<body>로그인에 성공했습니다.

</body>
</html>
<%
} else { // 로그인 실패시
%>
<script>
	alert("로그인에 실패하였습니다.");
	history.go(-1);
</script>
<%
}
%>


