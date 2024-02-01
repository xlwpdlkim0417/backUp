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
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "create table emp1 as select ename, job, sal from emp";
PreparedStatement pstmt = conn.prepareStatement(sql);
/* 일반 Statement랑 다른 점은? sql 변수가 들어가는 위치가 다름 */
/* 미리 준비시키니까 이득이 있음 (?) 나중에 실행만 시키면 되니까 */
pstmt.executeQuery();
%>
접속 완료! <br/> emp1 테이블 생성!
</body>
</html>