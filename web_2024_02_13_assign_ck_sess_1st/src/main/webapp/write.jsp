<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

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
	request.setCharacterEncoding("utf-8");
	// 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
	String tmp = request.getParameter("num");
	// "num" 값이 있다는 말은 기존에 입력된 값이 있다는 말이고 여기서는 글을 쓰면 부여되는 번호를 의미함
	// 즉, index에서 처음 글을 쓴다는 것은 "num"의 값이 없다는 말이고, 주어지지 않았으면 0으로 설정된다는 의미

	int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;
	// A ? B : C; 삼항 연산자
	// A = 조건식
	// B = 조건식 A가 TRUE일 때, 반환되거나 실행되는 값
	// C = 조건식 A가 FALSE일 때, 반환되거나 실행되는 값

	/* System.out.println(session.getAttribute("MEMBERID")); */
	// 이거 프린트해보니까 값이 10으로 나오는데 결국 session은 로그인 된 순간 생성되서 연관된 페이지 전부에 영향을 줄 수 있음

	/* String id = request.getParameter("id");
	String password = request.getParameter("password"); */

	// 새 글쓰기 모드를 가정하고 변수 초기값 설정
	String writer = "";
	String title = "";
	String content = "";
	String action = "insert.jsp";

	// 글 번호가 주어졌으면, 글 수정 모드
	if (num > 0) {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		Statement stmt = conn.createStatement();

		// 쿼리 실행
		ResultSet rs = stmt.executeQuery("select * from board where num=" + num);) {

			if (rs.next()) {
		// 읽어들인 글 데이터를 변수에 저장
		writer = rs.getString("writer");
		title = rs.getString("title");
		content = rs.getString("content");
		if (session.getAttribute("MEMBERPW").equals(writer)) {

			// 글 수정 모드일 때는 저장 버튼을 누르면 UPDATE 실행
			action = "update.jsp?num=" + num;
		} else {
	%>
	<script>
		alert("권한이 없습니다. 작성자만 수정할 수 있습니다.");
		history.go(-1);
	</script>
	<%
	}
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	%>


	<form method="post" action="<%=action%>">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" maxlength="80"
					value="<%=title%>"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" maxlength="20"
					value="<%=session.getAttribute("MEMBERPW")%>" readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" rows="10"><%=content%></textarea>
				</td>
			</tr>
		</table>

		<br> <input type="submit" value="저장"> <input
			type="button" value="취소" onclick="history.back()">
	</form>
</body>
</html>
