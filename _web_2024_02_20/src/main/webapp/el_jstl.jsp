<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${aaa = 10 }<br>
${aaa += 10 }<br>
${'문자'+='열' }<br>
${"1"+10 }<br>
<!-- 밖에서 쌍따옴표 쓰니까 안에서는 홑따옴표 쓴다고 보면 됨 -->
${'100'+'10' }<br>
<!-- 이것도 더해주네 ㅅㅂ -->
${1+'10' }<br>
<!-- 이거 110 나오는게 아니고 계산이 되네? ㅅㅂ -->
${100+20; 30+1 } <br>
<!-- ;앞은 실행되지만 표현되지 않음 -->
${sum = 10; '' } <br>
<!-- 잘 생각해라 값을 찍을 수는 있어 그게 비어있냐 아니냐인거지 ;'' -->
${sum = sum + 100; ''} <br>
${name = '홍길동' } <br>
${name == '강감찬' } <br>
${empty sum }
<!-- 비어있냐고 물어보는거-->
</body>
</html>