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
	/* 이거 post 때문에 해줘야하는거임 */

	String[] lang = request.getParameterValues("lang");
	/* 전부 다 문자열이기 때문에 String[] 이거밖에 없습니다 */
	/* .getParameterValues 메소드 이름 확인하시고요 */
	/* value=""의 값이 가는겁니다 */
	String[] hobby = request.getParameterValues("hobby");
	%>

	관심언어 :
	<%
	for (int i = 0; i < lang.length; i++) {
		out.println(lang[i] + " ");
	}
	%>
	<br> 취미 :
	<%
	for (int i = 0; i < hobby.length; i++) {
		out.println(hobby[i] + " ");
	}
	%>
</body>
</html>