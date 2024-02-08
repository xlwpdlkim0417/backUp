<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="util.Cookies"%>
<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");

boolean login = false;

String sql = "SELECT COUNT(*) FROM SCORE WHERE NUM = ? AND NAME = ?";

Class.forName("oracle.jdbc.driver.OracleDriver");

try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement(sql);) {

	pstmt.setString(1, id);
	pstmt.setString(2, pw);

	ResultSet rs = pstmt.executeQuery();

	rs.next();
	if (rs.getInt(1) == 1) {
		login = true;

	} else {
		System.out.println("로그인 못했다~");
	}
} catch (Exception e) {
	System.out.println("오류지롱");
}
if (login) {
	response.addCookie(Cookies.createCookie("AUTH", id, "/", -1));
	response.sendRedirect("index.jsp");
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
