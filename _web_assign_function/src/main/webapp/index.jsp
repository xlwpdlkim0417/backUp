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

	<%
	request.setCharacterEncoding("utf-8");
	String driver = "oracle.jdbc.driver.OracleDriver";
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
	}
	%>

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
			<th></th>
			<th></th>
			<th></th>
		</tr>


		<tr>
			<form method="get" id="frm">
				<td><input type="text" name="num" value="<%=num%>" /><br></td>
				<td><input type="text" name="name" value="<%=name%>" /><br></td>
				<td><input type="text" name="kor" value="<%=kor%>" /><br></td>
				<td><input type="text" name="eng" value="<%=eng%>" /><br></td>
				<td><input type="text" name="math" value="<%=math%>" /><br></td>

				<%-- <%
				int sum = Integer.parseInt("kor") + Integer.parseInt("eng") + Integer.parseInt("math");
				%>
				
				<td><%=sum%></td>
				<td><%=String.format("%.2f", (float) sum / 3)%></td> --%>
				
				<td></td>
				<td></td>
				
				<td><button onclick="search()">검색</button> <br></td>
				<td><button onclick="insert()">입력</button> <br></td>
				<td><button onclick="update()">수정</button> <br></td>
				<td><button onclick="del()">삭제</button> <br></td>
				<!-- <input type="button" onClick="del()" value="삭제I"/> -->
				<td><button onClick="reset">초기화</button></td>
			</form>
		</tr>

	</table>
	<script type="text/javascript">
		function serach() {
			document.querySelector('#frm').action = 'search.jsp'
			document.querySelector('#frm').submit();
		}
		function insert() {
			document.getElementById('frm').action = 'insert.jsp'
			document.getElementById('frm').submit();
		}
		function update() {
			document.querySelector('#frm').action = 'update.jsp';
			document.querySelector('#frm').submit();
		}
		function del() {
			/* delete는 자바스크립트의 예약어라서 사용 불가능 */
			document.getElementById('frm').action = 'delete.jsp';
			document.getElenemtById('frm').submit();
		}
	</script>

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
		try (Connection conn0 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");) {
			String sql0 = "select * from score";
			PreparedStatement pstmt0 = conn0.prepareStatement(sql0);
			ResultSet rs0 = pstmt0.executeQuery();
			while (rs0.next()) {
				int sum0 = rs0.getInt("kor") + rs0.getInt("eng") + rs0.getInt("math");
		%>
		<tr>
			<td><%=rs0.getInt("num")%></td>
			<td><%=rs0.getString("name")%></td>
			<td><%=rs0.getInt("kor")%></td>
			<td><%=rs0.getInt("eng")%></td>
			<td><%=rs0.getInt("math")%></td>
			<td><%=sum0%></td>
			<td><%=String.format("%.2f", (float) sum0 / 3)%></td>
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