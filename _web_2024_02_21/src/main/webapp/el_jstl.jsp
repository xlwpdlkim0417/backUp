<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setAttribute("name", "홍길동");	//포워딩 된 것으로 가정!
request.setAttribute("arr2", new int [] {1,2,3,4,5});
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10">
${i; '' }
${sum = sum + i; '' }
</c:forEach>
1~10까지의 합 : ${sum }<br>
<c:forEach var="i" begin="0" end="10" step="2">
${i; '' }
${sumd = sumd + i; '' }
</c:forEach>
1~10까지의 짝수 합 : ${sumd }<br>
<c:forEach var="i" begin="1" end="10" step="2" varStatus="sta">
${i } :
${sta.index } <br>
${sumd = sumd + i; '' }
</c:forEach>
<br>
${intArray = [100,200,300,400,500] }<br>
<c:forEach var="v" items="${arr2 }" varStatus="st">
${st.index } : ${v } 그리고 개수 : ${st.count }<br>
</c:forEach>

</body>
</html>