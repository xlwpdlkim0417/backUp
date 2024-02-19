<%@ page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Member member = new Member("100", "100@korea.com", "백");
    request.setAttribute("mmm", member);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=member.getName() %><br/>
${mmm.name }
${asdfasdf }
</body>
</html>