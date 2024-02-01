<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 결과</title>
</head>
<body>
국어 : <%=request.getParameter("kor") %><br/>
영어 : <%=request.getParameter("eng") %><br/>
수학 : <%=request.getParameter("math") %><br/>

<!-- 위에 있는 걸로 자바를 쓸 수 있음 -->
<!-- request라는 객체의 getParameter() 메소드 활용 -->
<!-- 앞에서 숫자 넣어도 넘어올 때 String으로 넘어옴 -->
</body>
</html>