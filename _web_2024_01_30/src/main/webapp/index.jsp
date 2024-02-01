<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국영수 점수 입력</title>
</head>
<body>
	<form action="4-2.jsp" method="post">
	<!-- 위에 원래 method="get"이었음 -->
		국어 : <input type="text" name="kor" /><br />
		영어 : <input type="text" name="eng" /><br />
		수학 : <input type="text" name="math" /><br />
		<input type="submit" value="확인" />
		<!-- submit을 꼭 기억할 것 -->
	</form>
	<!-- form이 들어간 문서가 하나 있고 그 문서 내용을 받아주는 문서가 있고 -->
</body>
</html>