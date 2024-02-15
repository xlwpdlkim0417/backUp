<%@ page contentType="text/html; charset=utf-8"%>
<%
String memberId = (String) session.getAttribute("MEMBERID");
boolean login = memberId == null ? false : true;
%>
<html>
<head>
<title>로그인여부 검사</title>
</head>
<body>

	<%
	if (login) {
	%>
	<form action="sessionLogout.jsp" method="post">
		<%=memberId%>님 로그인 한 상태 <input type="submit" value="로그아웃">
	</form>
	<%
	} else {
	%>
	<form action="sessionLogin.jsp" method="post">
		아이디 <input type="text" name="id" size="10">
		Remember Me<input type="checkbox" name="remember" value="" />
		이름 <input type="text" name="password" size="10">
		<input type="submit" value="로그인">
	</form>
	<%
	}
	%>
</body>
</html>
