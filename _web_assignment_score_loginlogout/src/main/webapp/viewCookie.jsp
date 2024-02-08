<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" id="cookiefrm">
		<table>
			<tr>
				<th>id</th>
				<th>pw</th>
			</tr>
			<%
			Cookie[] cookie = request.getCookies();
			//쿠키 만들고 가져오라는 명령어
			if (cookie != null && cookie.length > 0) {
				for (Cookie ck : cookie) {
					if (!ck.getName().equals("JSESSIONID")) {
			%>
			<tr>
				<td><input type="text" name="id" value=<%=ck.getName()%>></td>
				<td><input type="text" name="pw"
					value=<%=URLDecoder.decode(ck.getValue(), "utf-8")%>></td>
				<td><button onclick="updateCookie()">쿠키 업데이트</button></td>
				<td><button onclick="deleteCookie()">쿠키 삭제</button></td>
			</tr>
			<%
			}
			}
			}
			%>
		</table>
	</form>
	<script type="text/javascript">
		function login() {
			document.getElementById('loginfrm').action = 'login.jsp'
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
			document.getElementById('cookiefrm').action = 'deleteCookie.jsp'
			document.getElementById('cookiefrm').submit();
		}
		function updateCookie() {
			document.getElementById('cookiefrm').action = 'updateCookie.jsp'
			document.getElementById('cookiefrm').submit();
		}
	</script>
	<!-- response.sendRedirect("index.jsp"); -->
	<a href="index.jsp">index</a>
</body>
</html>