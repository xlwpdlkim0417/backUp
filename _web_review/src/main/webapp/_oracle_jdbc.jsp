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
	/* Oracle JDBC 드라이버 클래스를 로드합니다.
	이 클래스는 Oracle 데이터베이스에 연결할 때 필요합니다. */
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	/* 데이터베이스 연결을 위한 JDBC URL을 정의합니다.
	여기서 'localhost'는 데이터베이스가 실행 중인 서버를 가리키며, 
	'1521'은 Oracle의 기본 포트 번호입니다.
	'xe'는 Oracle 데이터베이스 인스턴스의 이름입니다. */
	Class.forName(driver);
	/* 드라이버 클래스를 메모리에 로드합니다.
	이는 JDBC 드라이버를 초기화하는데 사용됩니다. */
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	/* DriverManager 클래스를 사용하여 데이터베이스에 연결합니다.
	연결 정보로는 URL, 사용자 이름('scott')과 비밀번호('tiger')를 사용합니다. */
	String sql = "create table emp_ as select * from emp";
	/* 실행할 SQL 쿼리를 정의합니다.
	이 쿼리는 'emp' 테이블을 복사하여 'emp1'이라는 새로운 테이블을 생성합니다. */
	PreparedStatement pstmt = conn.prepareStatement(sql);
	/* SQL 쿼리를 실행하기 위한 PreparedStatement 객체를 생성합니다.
	PreparedStatement는 미리 컴파일된 SQL 문을 나타내며,
	실행 시간에 효율적인 실행을 위해 사용됩니다. */
	pstmt.executeQuery();
	/* 데이터베이스에서 SQL 쿼리를 실행하고 결과를 ResultSet 객체로 반환합니다.
	이 메서드는 주로 SELECT 쿼리에 사용되며, 
	데이터베이스로부터 데이터를 조회할 때 사용됩니다. */
	%>
	접속 완료!
</body>
</html>