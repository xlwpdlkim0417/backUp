<%@ page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
	/* Member member = (Member)session.getAttribute("member"); */
	/* if (member != null){} */
	/* 아래 조건식을 위처럼 바꿀 수 있다는 말임 */
	/* 그럼 아래 ~님 로그인을 좀 더 직관적으로 바꿀 수도 있지 */
    if ((String)session.getAttribute("userId") != null) {          
        // 로그인 상태일 때의 출력 
%>
        <form action="logout.jsp" method="post">  
            <%=(String)session.getAttribute("userName")%>님 로그인
            <%-- <%=member.getName()%>님 로그인 --%>
            <input type="submit" value="로그아웃">
            <input type="button" value="회원정보 수정" 
                   onclick="window.open('member_update_form.jsp', 'popup', 
                                        'width=600, height=300')">
        </form>
<%  
    } else {                       
        // 로그인되지 않은 상태일 때의 출력
%>
        <form action="login.jsp" method="post"> 
            아이디:   <input type="text"     name="id">&nbsp;&nbsp;
            이메일: <input type="text" name="pw">
            <input type="submit" value="로그인">
            <input type="button" value="회원가입" 
                   onclick="window.open('member_join_form.jsp', 'popup', 
                                        'width=600, height=300')">
        </form>
<%
    }
%>

</body>
</html>
