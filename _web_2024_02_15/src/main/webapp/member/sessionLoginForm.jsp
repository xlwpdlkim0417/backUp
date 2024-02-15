<%@page import="util.Cookies"%>
<%@ page contentType="text/html; charset=utf-8"%>

<%
request.setCharacterEncoding("utf-8");
Cookies cookies = new Cookies(request); //request 기본 객체를 집어 넣어 줘야 합니다
%>
<html>
<head>
<title>로그인폼</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/member/sessionLogin.jsp" method="post">
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

</body>
</html>
