<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="util.Cookies"%>
<%@ page contentType="text/html; charset=utf-8"%>

<%
String id = request.getParameter("id");
String password = request.getParameter("password");

Class.forName("oracle.jdbc.driver.OracleDriver");
try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");) {
	String sql = "select num, name, kor, eng, math from score where num = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("num"));
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {

	}

	if (id.equals(password)) {
		// ID와 암호가 같으면 로그인에 성공한 것으로 판단.
		response.addCookie(Cookies.createCookie("AUTH", id, "/", -1));
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
}
%>
