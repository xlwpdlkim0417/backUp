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

	<a href="index.jsp">목록으로</a>

	<%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "select ename, job, sal from emp1";
	/* 애스터리스크(*)보다 그냥 필드를 직접 보여주는게 나음 */
	PreparedStatement pstmt = conn.prepareStatement(sql);
	/* 일반 Statement랑 다른 점은? sql 변수가 들어가는 위치가 다름 */
	/* 미리 준비시키니까 이득이 있음 (?) 나중에 실행만 시키면 되니까 */
	ResultSet rs = pstmt.executeQuery();
	%>
	<table border="2">

		<%
		while (rs.next()) {
		%>
		<!-- out.println(rs.getString("ename"));
	/* 서블릿 스타일로 이쁘게 만들려면 (("ename")+"<br/>") 이렇게도 쓰지만 좀 무식한 방법임*/
	out.println(rs.getString("job"));
	out.println(rs.getString("sal")); -->
		<tr>
			<td><a href="updateForm.jsp?ename=<%=rs.getString("ename")%>"><%=rs.getString("ename")%></a></td>
			<!-- 일반 자바식이 아니라 "=" 이거 들어가있는 건 표현식으로 값을 넣어주는 거임 -->
			<td><%=rs.getString("job")%></td>
			<td><%=rs.getString("sal")%></td>
			<td><a href="delete.jsp?ename=<%=rs.getString("ename")%>">삭제</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>