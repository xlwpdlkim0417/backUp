<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

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
</head>
<body>

	<form action="_oracleInsert" method="post">
		번호 <input type="text" name="num" /><br />
		이름 <input type="text" name="name" /><br />
		국어 <input type="text" name="kor" /><br />
		영어 <input type="text" name="eng" /><br />
		수학 <input type="text" name="math" /><br />
		<br>
		<input type="submit" value="확인" /> <input type="reset" />
	</form>
<br>
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
			String sql = "select * from score";
			PreparedStatement pstmt = conn.prepareStatement(sql);
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

</body>
</html>