<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String nameU = "";
String valueU = "";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 400px;
	text-align: center;
}

th {
	background-color: cyan;
}
</style>
</head>
<body>

	<form method="post" id="frm">
		쿠키 이름<input type="text" name="name" value="<%=nameU%>" /><br /> 쿠키
		값&nbsp; &nbsp;<input type="text" name="value" value="<%=valueU%>" /><br />

	</form>
	<button onclick="insert()">입력</button>
	<button onclick="update()">업데이트</button>
	<button onclick="clear()">초기화</button>

	<br>


	<table>
		<tr>
			<th>쿠키 이름</th>
			<th>쿠키 값</th>
			<th>쿠키 삭제</th>
		</tr>
		<%
		Cookie[] cookies = request.getCookies();
		//쿠키 만들고 가져오라는 명령어
		if (cookies != null && cookies.length > 0) {
			for (Cookie ck : cookies) {
				if (!ck.getName().equals("JSESSIONID")) {
		%>
		<tr>
			<td><%=ck.getName()%></td>
			<td><%=URLDecoder.decode(ck.getValue(), "utf-8")%></td>
			<td>쿠키 삭제</td>
			<td><a href="deleteCookie.jsp?name=<%=ck.getName()%>">삭제</a></td>
		</tr>
		<%
		}
		}
		}
		%>
	</table>
	<script type="text/javascript">
		function insert() {
			document.getElementById('frm').action = 'mkCookie.jsp'
			document.getElementById('frm').submit();
		}
		function update() {
			document.querySelector('#frm').action = 'updCookie.jsp';
			document.querySelector('#frm').submit();
		}
		function clear() {
			var cl = document.getElementById('frm');
			for (var i = 0; i < cl.length; i++) {
				cl[i].value = '';
			}
		}
	</script>
	<!-- 스크립트 위치는 바디 마무리 바로 앞이 제일 성능이 좋음 -->
</body>
</html>