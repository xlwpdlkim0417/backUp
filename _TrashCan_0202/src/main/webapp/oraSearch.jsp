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
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "select num, name, kor, eng, math from score where num = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("num"));
	ResultSet rs = pstmt.executeQuery();
	
	String searchName = "";
	String searchKor = "";
	String searchEng = "";
	String searchMath = "";
	String searchNum = "";
	
	if(rs.next()){
		searchName = rs.getString("name");
		searchKor = rs.getString("kor");
		searchEng = rs.getString("eng");
		searchMath = rs.getString("math");
		searchNum = rs.getString("num");
	}	
	%>
	
	<form action="oraSelect.jsp" method="get">
		번호 <input type="text" name="num" value="<%=searchNum %>"/><br>
		이름 <input type="text" name="name" value="<%=searchName %>"/><br>
		국어 <input type="text" name="kor" value="<%=searchKor %>"/><br> 
		영어 <input type="text" name="eng" value="<%=searchEng %>"/><br>
		수학 <input type="text" name="math" value="<%=searchMath %>"/><br>
		<input type="submit" value="검색" />
	</form>
	
	<a href="oraSelect.jsp">목록으로</a>
	
</body>
</html>