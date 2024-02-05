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
	width: 100%;
	border-collapse: collapse;
	text-align: left;
	margin-top: 20px;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
}

th {
	background-color: #f2f2f2;
	color: black;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

tr:hover {
	background-color: #f1f1f1;
}

input[type="text"], input[type="submit"], input[type="reset"], button {
	padding: 5px;
	margin: 5px;
	border-radius: 5px;
	border: 1px solid #ddd;
}

input[type="submit"], input[type="reset"], button {
	background-color: #4CAF50;
	color: white;
	cursor: pointer;
}

input[type="submit"]:hover, input[type="reset"]:hover, button:hover {
	background-color: #45a049;
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
			<th></th>
			<th></th>
		</tr>
		<tr>
			<form action=insert.jsp method=get>
				<td><input type="text" name="num" /> <!-- <input type="submit" name="action" value="검색" /> -->
					<br></td>
				<td><input type="text" name="name" /><br></td>
				<td><input type="text" name="kor" /><br></td>
				<td><input type="text" name="eng" /><br></td>
				<td><input type="text" name="math" /><br></td>
				<td></td>
				<td></td>
				<td><input type="submit" name="action" value="입력" /></td>
				<td><input type="reset" /></td>
			</form>
		</tr>
		<form action=index.jsp method=get>
			번호 검색<input type="text" name="num" /> <input type="submit"
				value="검색" /> <input type="reset" />
		</form>
		<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		String sql = "select * from score where num = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("num"));
		ResultSet rs = pstmt.executeQuery();
		String num = "";
		String name = "";
		String kor = "";
		String eng = "";
		String math = "";
		if (rs.next()) { // 왜 if 일까? 무조건 1건(행, 레코드)
			num = rs.getString("num");
			name = rs.getString("name");
			kor = rs.getString("kor");
			eng = rs.getString("eng");
			math = rs.getString("math");

			int sum = rs.getInt("kor") + rs.getInt("eng") + rs.getInt("math");
		%>
		<tr>
			<form action="update.jsp" method="get">
				<td><input type="text" name="num" value="<%=num%>" /></td> <br />
				<td><input type="text" name="name" value="<%=name%>" /></td> <br />
				<td><input type="text" name="kor" value="<%=kor%>" /></td> <br />
				<td><input type="text" name="eng" value="<%=eng%>" /></td> <br />
				<td><input type="text" name="eng" value="<%=math%>" /></td> <br />
				<td><%=sum%></td>
				<td><%=String.format("%.2f", (float) sum / 3)%></td> <br>
				<td><input type="submit" value="업데이트" /></td>
				<td><button onclick="location.href='delete.jsp?num=<%=num%>'">삭제</button></td>
			</form>
			<%
			}
			%>
		</tr>
	</table>
	<br>
	<br>
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
		try (Connection conn2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");) {
			String sql2 = "select * from score";
			PreparedStatement pstmt2 = conn2.prepareStatement(sql2);
			ResultSet rs2 = pstmt2.executeQuery();
			while (rs2.next()) {
				int sum = rs2.getInt("kor") + rs2.getInt("eng") + rs2.getInt("math");
		%>
		<tr>
			<td><%=rs2.getInt("num")%></td>
			<td><%=rs2.getString("name")%></td>
			<td><%=rs2.getInt("kor")%></td>
			<td><%=rs2.getInt("eng")%></td>
			<td><%=rs2.getInt("math")%></td>
			<td><%=sum%></td>
			<td><%=String.format("%.2f", (float) sum / 3)%></td>
		</tr>
		<%
		}
		%>
		<%
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
	</table>
</body>
</html>