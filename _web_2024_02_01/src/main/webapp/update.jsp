<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "update emp1 set ename = ?, job = ?, sal = ? where ename = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	/* 일반 Statement랑 다른 점은? sql 변수가 들어가는 위치가 다름 */
	/* 미리 준비시키니까 이득이 있음 (?) 나중에 실행만 시키면 되니까 */
	pstmt.setString(1, request.getParameter("new_ename"));
	pstmt.setString(2, request.getParameter("job"));
	pstmt.setString(3, request.getParameter("sal"));
	pstmt.setString(4, request.getParameter("current_ename"));
	pstmt.executeUpdate();
	
	
	%>
	업데이트 완료!
	<a href="select.jsp">목록으로</a>
</body>
</html>