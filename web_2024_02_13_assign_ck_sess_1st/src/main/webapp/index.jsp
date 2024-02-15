<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<%
request.setCharacterEncoding("utf-8");
Cookies cookies = new Cookies(request); //request 기본 객체를 집어 넣어 줘야 합니다
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
    font-family: 'Arial', sans-serif;
    background-color: #ffffff; /* 배경색을 흰색으로 변경 */
    color: #555; /* 글자 색상 유지 */
    margin: 0;
    padding: 20px;
}

table {
    width: 680px;
    margin: auto;
    border-collapse: collapse;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
    padding: 10px;
    border: 1px solid #ddd; /* 경계선 색상을 더 연한 회색으로 변경 */
    text-align: left;
}

th {
    background-color: #f9f9f9; /* 헤더 배경색을 매우 연한 회색으로 변경 */
    color: #555; /* 헤더 글자색 유지 */
}

a:link, a:visited {
    color: #007bff; /* 링크 색상을 기본 파란색으로 변경 */
    text-decoration: none;
}

a:hover {
    color: #0056b3; /* 호버 시 링크 색상을 더 짙은 파란색으로 변경 */
}

input[type=submit], input[type=button] {
    background-color: #007bff; /* 버튼 배경색을 기본 파란색으로 변경 */
    color: white; /* 버튼 글자색 유지 */
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-right: 10px;
}

input[type=submit]:hover, input[type=button]:hover {
    background-color: #0056b3; /* 호버 시 버튼 배경색을 더 짙은 파란색으로 변경 */
}

input[type=text], textarea {
    width: calc(100% - 22px); /* 입력 필드 너비 조정 */
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ddd; /* 경계선 색상을 더 연한 회색으로 변경 */
    border-radius: 3px;
}

textarea {
    resize: vertical; /* 세로 크기 조절 가능 */
}

/* 로그인 창 스타일 */
.login-box {
    width: 300px; /* 로그인 창 너비 조정 */
    padding: 20px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background: #f9f9f9; /* 로그인 창 배경색을 매우 연한 회색으로 변경 */
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
}
/* 로그인 상태 및 버튼 오른쪽 정렬 */
.right-aligned {
    text-align: right;
    width: 100%;
}

/* 버튼 스타일 */
.button-right {
    float: right; /* 버튼을 오른쪽으로 정렬 */
    margin-left: 10px; /* 버튼 간 간격 조정 */
}
</style>
</head>
<body>
	<%
	String memberId = (String) session.getAttribute("MEMBERID");
	String memberPw = (String) session.getAttribute("MEMBERPW");
	boolean login = memberId == null ? false : true;
	%>
	<%
	if (login) {
	%>
	<div class="right-aligned">
	 <form action="sessionLogout.jsp" method="post" style="display:inline;">
		<!--8-3.jsp:로그아웃 처리-->
		<%=memberPw%> 회원님 로그인 하셨습니다
		<input type="submit" value="로그아웃" class="button-right">
	</form>
	</div>

	<table>
		<tr>
			<th class="num">번호</th>
			<th class="title">제목</th>
			<th class="writer">작성자</th>
			<th class="regtime">작성일시</th>
			<th>조회수</th>
		</tr>
		<%
		// 게시글 리스트 읽어오기
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
				Statement stmt = conn.createStatement();

				// 쿼리 실행
				ResultSet rs = stmt.executeQuery("select * from board order by num desc");) {
			// 게시글 레코드가 남아있는 동안 반복하며 화면에 출력
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("num")%></td>
			<td style="text-align: left;"><a
				href="view.jsp?num=<%=rs.getInt("num")%>"> <%=rs.getString("title")%>
			</a></td>
			<td><%=rs.getString("writer")%></td>
			<td><%=rs.getString("regtime")%></td>
			<td><%=rs.getInt("hits")%></td>
		</tr>
		<%
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
	</table>

	<br>
	<div class="right-aligned">
	<input type="button" value="글쓰기" onclick="location.href='write.jsp'" class="button-right">
	</div>
	<%
	} else {
	%>
	<div class="login-box">
	<form action="sessionLogin.jsp" method="post">
		<%
		if (cookies.exists("MEMBERLOGID")&&cookies.exists("MEMBERLOGPW")) {
		%>
		아이디 <input type="text" name="id" size="10" value="<%=cookies.getValue("MEMBERLOGID")%>">
		이름 <input type="text" name="password" size="10" value="<%=cookies.getValue("MEMBERLOGPW")%>">
		<%
		} else {
		%>
		아이디 <input type="text" name="id" size="10">
		이름 <input type="text" name="password" size="10">	
		<%
		}
		%>
		Remember Me<input type="checkbox" name="remember" checked />
		<input type="submit" value="로그인">
	</form>
	</div>
	<%
	}
	%>

</body>
</html>
