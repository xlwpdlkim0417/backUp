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
<title>Insert title here</title>
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
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");) {
			String sql = "select num, name, kor, eng, math from score where num = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("num"));
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int sum = rs.getInt("kor") + rs.getInt("eng") + rs.getInt("math");
		%>
		<tr>
			<td><%=rs.getInt("num")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getInt("kor")%></td>
			<td><%=rs.getInt("eng")%></td>
			<td><%=rs.getInt("math")%></td>
			<td><%=sum%></td>
			<td><%=String.format("%.2f", (float) sum / 3)%></td>
		</tr>
		<%
		}

		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
	</table>
	
	<a href="index.jsp">목록으로</a>
</body>
</html>