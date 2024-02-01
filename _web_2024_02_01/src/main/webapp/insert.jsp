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
	String sql = "insert into emp1(ename, job, sal) values(?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, "홍길동");
	pstmt.setString(2, "사원");
	pstmt.setDouble(3, 3120);

	int result = pstmt.executeUpdate();
	if (result == 1) {
		out.println("입력 성공");
	}
	/* emp1() 이 안에는 column 목록 넣어두고 values()는 ? 설정 후 pstmt.로 set~() 메소드 사용 */
	/* pstmt.executeQuery(); 이건 insert에서 안씁니다 */
	%>
	접속 완료!
	<br /> emp1 테이블 생성!
</body>
</html>