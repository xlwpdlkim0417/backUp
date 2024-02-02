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
	request.setCharacterEncoding("utf-8");
	/* method="post"에 대해서 utf-8로 인코딩해달라는 말임 */
	/* 각각 별도의 웹페이지라서 request객체를 공통적으로 사용하기 때문에 인코딩이 필요한 거임 */
	/* insert_pstmt랑 insertForm_post랑*/
	/* getParameter에서 값을 꺼내는 거라서 그것보다 위에서 인코딩 해주라고 요청하는 거임 */
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "insert into emp1(ename, job, sal) values(?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("ename"));
	pstmt.setString(2, request.getParameter("job"));
	pstmt.setDouble(3, Double.parseDouble(request.getParameter("sal")));
	/* Double로 받지 않아도 String으로 그냥 받아도 괜찮음 */
	int result = pstmt.executeUpdate();
	if (result == 1) {
		out.println("입력 성공");
	}
	/* emp1() 이 안에는 column 목록 넣어두고 values()는 ? 설정 후 pstmt.로 set~() 메소드 사용 */
	/* pstmt.executeQuery(); 이건 insert에서 안씁니다 */
	%>
	<a href="select.jsp">목록으로</a>

	<%
	response.sendRedirect("select.jsp");
	/* 페이지에 머물지 않고 다른 곳으로 넘어간다고 생각하면 됨
	insert나 delete 등의 실행 후 결과 자동 출력 기능에 넣으면 효과적 */
	%>
</body>
</html>