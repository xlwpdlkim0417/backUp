<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="search.jsp" method="get">
		번호 <input type="text" name="num" value="<%=request.getParameter("num") %>"/><br>
		이름 <input type="text" name="name" /><br>
		국어 <input type="text" name="kor" /><br>
		영어 <input type="text" name="eng" /><br>
		수학 <input type="text" name="math" /><br>
		<input type="submit" value="확인" />
		<input type="reset" />
	</form>
	
	<a href="index.jsp">목록</a>
</body>
</html>