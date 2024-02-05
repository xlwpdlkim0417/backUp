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
<title>Insert title here</title>
</head>
<body>
	<%
	String action = request.getParameter("action");

	if ("검색".equals(action)) {
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
		
		<form action="select.jsp" method="get">
		<input type="text" name="num" value="<%=num%>" /> <br />
		<td><input type="search" name="name" value="<%=name%>" /></td> <br />
		<td><input type="text" name="kor" value="<%=kor%>" /></td> <br />
		<td><input type="text" name="eng" value="<%=eng%>" /></td> <br />
		<td><input type="text" name="math" value="<%=math%>" /></td> <br />
		<td><%=sum%></td>
		<td><%=String.format("%.2f", (float) sum / 3)%></td> <br>
		<td><input type="submit" value="select" /></td>
		<td><button onclick="location.href='delete.jsp?num=<%=num%>'">삭제</button></td>
		</form>
	<%}
	} else {
		request.setCharacterEncoding("utf-8");
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		String sql = "insert into score(num, name, kor, eng, math) values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("num"));
		pstmt.setString(2, request.getParameter("name"));
		pstmt.setString(3, request.getParameter("kor"));
		pstmt.setString(4, request.getParameter("eng"));
		pstmt.setString(5, request.getParameter("math"));
		int result = pstmt.executeUpdate();
		if (result == 1) {
			out.println("입력 성공");
		} else {
			out.println("입력 실패");
		}
	}
	%>


	<%
	response.sendRedirect("select.jsp");
	%>

	<a href="select.jsp">목록</a>
</body>
</html>