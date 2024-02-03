<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 400px;
	text-align: center;
}

th {
	background-color: cyan;
}
</style>
<title>SEARCH</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>

			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		String sql = "select num, name, kor, eng, math from score where num = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("num"));
		ResultSet rs = pstmt.executeQuery();

		String Snum = "";
		String Sname = "";
		String Skor = "";
		String Seng = "";
		String Smath = "";

		if (rs.next()) {
			Snum = rs.getString("num");
			Sname = rs.getString("name");
			Skor = rs.getString("kor");
			Seng = rs.getString("eng");
			Smath = rs.getString("math");

			
		}
		%>
		
		<form action="index.jsp" method="get">
		번호 <input type="text" name="num"/><br>
		이름 <input type="text" name="name"/><br>
		국어 <input type="text" name="kor"/><br>
		영어 <input type="text" name="eng"/><br>
		수학 <input type="text" name="math"/><br>
		<input type="submit" value="제출"> <input type="reset" />
		</form>
		
		
		<%
		response.sendRedirect("index.jsp");
		%>
		
		
		


	</table>


	<a href="index.jsp">목록으로</a>
</body>
</html>