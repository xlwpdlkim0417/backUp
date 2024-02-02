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
	/* Oracle 데이터베이스에 연결하기 위한 JDBC 드라이버의 클래스 이름을 지정합니다. */
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	/* Oracle 데이터베이스에 연결하기 위한 URL을 지정합니다.
	여기서 localhost:1521:xe는 로컬 호스트의 1521 포트에 있는 'xe' 인스턴스를 가리킵니다. */
	Class.forName(driver);
	/* Class.forName() 메서드를 사용하여 JDBC 드라이버를 메모리에 로드합니다. */
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	/* DriverManager.getConnection() 메서드를 사용하여 데이터베이스에 연결합니다.
	사용자 이름 (scott)과 비밀번호 (tiger)를 포함합니다 */
	String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp_";
	/* emp_ 테이블에서 여러 컬럼을 조회하는 SQL 쿼리를 문자열로 정의합니다. */
	PreparedStatement pstmt = conn.prepareStatement(sql);
	/* SQL 쿼리를 실행하기 위해 PreparedStatement 객체를 생성합니다. */
	ResultSet rs = pstmt.executeQuery();
	/* executeQuery() 메서드를 사용하여 SQL 쿼리를 실행하고,
	ResultSet 객체에 결과를 저장합니다. */
	%>

	<table border="2">

		<%
		while (rs.next()) {
			/* ResultSet 객체의 next() 메서드를 사용하여 결과셋의 다음 행으로 이동합니다.
			결과셋에 더 이상 행이 없을 때까지 반복합니다. */
		%>
		<tr>
			<td><%=rs.getString("empno")%></td>
			<!-- ResultSet에서 empno 컬럼의 값을 문자열로 가져와 출력합니다. -->
			<td><%=rs.getString("ename")%></td>
			<td><%=rs.getString("job")%></td>
			<td><%=rs.getString("mgr")%></td>
			<td><%=rs.getString("hiredate")%></td>
			<td><%=rs.getString("sal")%></td>
			<td><%=rs.getString("comm")%></td>
			<td><%=rs.getString("deptno")%></td>
		</tr>
		<%
		}
		%>
	
</body>
</html>