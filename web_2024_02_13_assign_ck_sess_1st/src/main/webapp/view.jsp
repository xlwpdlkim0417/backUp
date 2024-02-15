<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<%
request.setCharacterEncoding("utf-8");
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));

// 게시글 데이터를 담을 변수 정의
String writer = "";
String title = "";
String content = "";
String regtime = "";
int hits = 0;

// 지정된 글 번호를 가진 레코드 읽기
Class.forName("com.mysql.cj.jdbc.Driver");
try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		Statement stmt = conn.createStatement();

		// 쿼리 실행
		ResultSet rs = stmt.executeQuery("select * from board where num=" + num);) {
	if (rs.next()) {

		// 글 데이터를 변수에 저장
		writer = rs.getString("writer");
		title = rs.getString("title");
		content = rs.getString("content");
		regtime = rs.getString("regtime");
		hits = rs.getInt("hits");

		// 글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
		// 공백과 줄 바꿈 처리
		title = title.replace(" ", "&nbsp;");
		content = content.replace(" ", "&nbsp;").replace("\n", "<br>");

		// 이 글의 조회수를 1 올림
		stmt.executeUpdate("update board set hits=hits+1 where num=" + num);
	}
} catch (Exception e) {
	e.printStackTrace();
}
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

	<table>
		<tr>
			<th>제목</th>
			<td><%=title%></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><%=writer%></td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><%=regtime%></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td><%=hits%></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%=content%></td>
		</tr>
	</table>

	<br>
	<div class="right-aligned">
		<input type="button" value="수정" onclick="location.href='write.jsp?num=<%=num%>'" class="button-right">
		<input type="button" value="목록" onclick="location.href='index.jsp'" class="button-right">
		<input type="button" value="삭제" onclick="location.href='delete.jsp?num=<%=num%>'" class="button-right">
	</div>
</body>
</html>
