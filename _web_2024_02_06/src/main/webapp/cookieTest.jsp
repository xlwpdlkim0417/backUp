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
	Cookie ck = new Cookie("aaa", "bbb");
	//Cookie ck1 = new Cookie("loginId", "admin");
	ck.setMaxAge(60);
	//60초만 살아있는 쿠키 (60*60*24*30) 초*분*24시간하루*30일한달
	//이거 시간을 0으로 세팅하면 쿠키를 삭제하는 메소드가 됩니다 별도의 삭제 메소드 없으므로 기억해둘 것
	//이거 세팅을 먼저 하고 add 해줘야 오류 발생하지 않음 
	response.addCookie(ck);

	//response.addCookie(ck1);
	%>
	<%=ck.getName()%><br>
	<%=ck.getValue()%><br>
	<%-- <%=ck1.getName()%><br>
	<%=ck1.getValue()%> --%>
</body>
</html>
<!-- JSESSIONID 이건 쿠키가 서버랑 연관되어 있다는 표시같은 거임 -->
<!-- 그리고 브라우저를 닫은 뒤에 쿠기를 생성하지 않고 쿠키 개수를 표시하는 jsp를 실행하고 새로고침하면 JSESSIONID가 나오는데 그거 일련번호가 바뀔 거임 -->