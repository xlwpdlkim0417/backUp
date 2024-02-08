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
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 20px;
}

.container {
	max-width: 1600px;
	margin: auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

h2 {
	color: #333;	
	text-align: center;
	margin-bottom: 20px;
}

table {
	width: 100%;
	border-collapse: collapse;
	/* margin-top: 20px; */
}

th, td {
	padding: 10px;
	border: 1px solid #ddd;
	text-align: center;
}

th {
	background-color: #f2f2f2;
	color: #333;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

.login-container, .form-group, input, button {
	width: 100%;
}

.login-container {
	padding: 0;
	margin-top: 0;
}

input[type="text"], input[type="password"], button {
	padding: 10px;
	margin-top: 10px;
	border: 1px solid #ddd;
	border-radius: 4px;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	cursor: pointer;
	margin-top: 20px;
}

button:hover {
	background-color: #45a049;
}

.form-group {
	margin-bottom: 10px;
}

label {
	display: block;
	margin-bottom: 5px;
}

.form-actions {
	text-align: right;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
	String userId = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("userId")) {
		userId = cookie.getValue();
		break;
			}
		}
	}
	%>
	<div class="container">
		<%
		if (userId != null) {
		%>
		<h2>
			환영합니다,
			<%=userId%>번 회원님
		</h2>
		<form action="logoutPROCESS.jsp" method="post">
			<div class="form-actions">
				<button type="submit">로그아웃</button>
			</div>
		</form>
		<%
		request.setCharacterEncoding("utf-8");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		String sql = "select * from score where num = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("num"));
		ResultSet rs = pstmt.executeQuery();

		String num = "";
		String name = "";
		String kor = "";
		String eng = "";
		String math = "";

		int sum = 0;
		float avg = 0.0f;

		if (rs.next()) { // 왜 if 일까? 무조건 1건(행, 레코드)
			num = rs.getString("num");
			name = rs.getString("name");
			kor = rs.getString("kor");
			eng = rs.getString("eng");
			math = rs.getString("math");

			sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
		}
		%>
		<form method="post" id="frm">
			<table>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>총점</th>
					<th>평균</th>
					<th colspan="5"></th>
				</tr>
				<tr>
					<td><input type="text" name="num" value="<%=num%>" /><br></td>
					<td><input type="text" name="name" value="<%=name%>" /><br></td>
					<td><input type="text" name="kor" value="<%=kor%>" /><br></td>
					<td><input type="text" name="eng" value="<%=eng%>" /><br></td>
					<td><input type="text" name="math" value="<%=math%>" /><br></td>
					<td><%=sum%></td>
					<td><%=String.format("%.2f", (float) sum / 3)%></td>
					<td><button onclick="search()">검색</button></td>
					<!-- <td><button onclick="insert()">입력</button></td>
					<td><button onclick="update()">수정</button></td>
					<td><button onclick="del()">삭제</button></td> -->
					<!-- <td><button onclick="clear()">초기화</button></td> -->
					<!-- <input type="button" onClick="del()" value="삭제I"/> -->
				</tr>
			</table>
		</form>
		<script type="text/javascript">
			function serach() {
				document.querySelector('#frm').action = 'search.jsp'
				document.querySelector('#frm').submit();
			}
			function insert() {
				document.getElementById('frm').action = 'insert.jsp'
				document.getElementById('frm').submit();
			}
			function update() {
				document.querySelector('#frm').action = 'update.jsp';
				document.querySelector('#frm').submit();
			}
			function del() {
				/* delete는 자바스크립트의 예약어라서 사용 불가능 */
				document.getElementById('frm').action = 'delete.jsp';
				document.getElenemtById('frm').submit();
			}
		</script>

		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>총점</th>
				<th>평균</th>
			</tr>
			<%
			int sumAll = 0;
			int loop = 0;

			int maxKor = 0;
			int maxEng = 0;
			int maxMath = 0;

			Class.forName("oracle.jdbc.driver.OracleDriver");
			try (Connection conn0 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");) {
				String sql0 = "select * from score order by num asc";
				PreparedStatement pstmt0 = conn0.prepareStatement(sql0);
				ResultSet rs0 = pstmt0.executeQuery();
				while (rs0.next()) {
					int getKor = rs0.getInt("kor");
					int getEng = rs0.getInt("eng");
					int getMath = rs0.getInt("math");

					int sum0 = rs0.getInt("kor") + rs0.getInt("eng") + rs0.getInt("math");
					sumAll += sum0;
					loop++;

					if (getKor > maxKor)
				maxKor = getKor;
					if (getEng > maxEng)
				maxEng = getEng;
					if (getMath > maxMath)
				maxMath = getMath;
			%>
			<tr>
				<td><%=rs0.getInt("num")%></td>
				<td><%=rs0.getString("name")%></td>
				<td><%=rs0.getInt("kor")%></td>
				<td><%=rs0.getInt("eng")%></td>
				<td><%=rs0.getInt("math")%></td>
				<td><%=sum0%></td>
				<td><%=String.format("%.2f", (float) sum0 / 3)%></td>
			</tr>
			<%
			}
			} catch (Exception e) {
			out.println(e.getMessage());
			}
			%>
			<tr>
				<td></td>
				<td></td>
				<td><%=maxKor%></td>
				<td><%=maxEng%></td>
				<td><%=maxMath%></td>
				<td></td>
				<td><%=String.format("%.2f", (float) sumAll / loop)%></td>
			</tr>
		</table>

		<%
		} else {
		%>
		<div class="login-container">
			<h2>로그인</h2>
			<form method="get" id="loginfrm">
				<div class="form-group">
					<label for="id">아이디</label> <input type="text" name="id" id="id">
				</div>
				<div class="form-group">
					<label for="pw">패스워드</label> <input type="text" name="pw"
						id="pw">
				</div>
				<button type="button" onclick="login()">로그인</button>
			</form>
		</div>
		<%
		}
		%>
	</div>

	<script type="text/javascript">
		function login() {
			document.getElementById('loginfrm').action = 'loginPROCESS.jsp'
			document.getElementById('loginfrm').submit();
		}
		function logout() {
			document.getElementById('loginfrm').action = 'logoutPROCESS.jsp'
			document.getElementById('loginfrm').submit();
		}
		function makeCookie() {
			document.getElementById('loginfrm').action = 'makeCookie.jsp'
			document.getElementById('loginfrm').submit();
		}
		function viewCookie() {
			document.getElementById('loginfrm').action = 'viewCookie.jsp'
			document.getElementById('loginfrm').submit();
		}
		function deleteCookie() {
			document.getElementById('loginfrm').action = 'deleteCookie.jsp'
			document.getElementById('loginfrm').submit();
		}
		function checkCookie() {
			document.getElementById('loginfrm').action = 'loginCheck.jsp'
			document.getElementById('loginfrm').submit();
		}
	</script>




</body>
</html>