<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
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
	String sql2 = "update score set name = ?, kor = ?, eng = ?, math = ? where num = ?";
	PreparedStatement pstmt2 = conn.prepareStatement(sql2);
	ResultSet rs = pstmt2.executeQuery();
	pstmt2.setString(1, request.getParameter("name"));
	pstmt2.setString(2, request.getParameter("kor"));
	pstmt2.setString(3, request.getParameter("eng"));
	pstmt2.setString(4, request.getParameter("math"));
	pstmt2.setString(5, request.getParameter("num"));
	pstmt2.executeUpdate();	
	
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
	
	
	
	<form action="index.jsp" method="get">
		번호 <input type="text" name="num" value="<%=searchNum %>"/><br>
		이름 <input type="text" name="name" value="<%=searchName %>"/><br>
		국어 <input type="text" name="kor" value="<%=searchKor %>"/><br> 
		영어 <input type="text" name="eng" value="<%=searchEng %>"/><br>
		수학 <input type="text" name="math" value="<%=searchMath %>"/><br>
	</form>
	
	<%-- <%
	response.sendRedirect("index.jsp");
	%> --%>
	
	<a href="index.jsp">목록으로</a>
	
</body>
</html>