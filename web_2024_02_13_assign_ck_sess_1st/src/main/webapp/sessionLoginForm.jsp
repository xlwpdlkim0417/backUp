<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>로그인폼</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/member/sessionLogin.jsp" method="post">
		<!-- Context=도메인 full 주소 -->
		아이디 <input type="text" name="id" size="10">
		Remember Me<input type="checkbox" name="remember" value="" />
		이름 <input type="text" name="password" size="10">
		<input type="submit" value="로그인">
	</form>

</body>
</html>
