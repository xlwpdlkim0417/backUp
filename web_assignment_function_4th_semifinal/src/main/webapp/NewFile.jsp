<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
	String id = request.getParameter("id");
	String email = request.getParameter("pw");
	String ck = request.getParameter("ck");

	if (ck != null && ck.equals("on")) {
		// 체크박스에 체크가 되어있을 때 쿠키를 생성하기 때문에 체크박스에 체크를 안하고 로그인하면 쿠키 생성이 되지 않음
		// 그래서 선택해야 함
		// 1. 로그인 정보를 기억할 쿠키를 별도로 만들어서 관리하던지
		// 2. 로그인 정보 기억 기능을 없애버리던지

		Cookie cookie = new Cookie("rememberemail", email);
		cookie.setMaxAge(60 * 60 * 24); //하루
		response.addCookie(cookie);

		Cookie cookie2 = new Cookie("rememberid", id);
		cookie2.setMaxAge(60 * 60 * 24); //하루
		response.addCookie(cookie2);
	} else {
		// 여기서 else가 의미하는 건?
		// 체크박스가 체크되어있지 않을 때임
		// 아래까지 종합하면 지금 짜놓은 건 로그인 기록 저장에 대한 부분이기 때문에 별도의 쿠키를 만들어야할듯
		// 아래쪽에 세션 만들 때 쿠키를 같이 만들면 안되나?
		
		Cookie cookie = new Cookie("rememberemail", "");
		Cookie cookie2 = new Cookie("rememberid", "");
		cookie.setMaxAge(0);
		cookie2.setMaxAge(0);
		response.addCookie(cookie);
		response.addCookie(cookie2);
	}

	Member member = MemberDao.getInstance().selectForLogin(id, email);

	// 그런 레코드가 있으면, 세션 속성을 등록하고, 메인 화면으로 돌아감
	if (member != null) {
		session.setAttribute("userId", member.getId());
		session.setAttribute("userEmail", member.getEmail());
		session.setAttribute("member", member); //세션에 객체를 저장하는 것

		if (id.equals("admin")) {
			Cookie cookie3 = new Cookie("admin", member.getId());
			response.addCookie(cookie3);
		}
		response.sendRedirect("index.jsp");
		return;
	}
	%>

	<script>
		alert('아이디 또는 비밀번호가 틀립니다!');
		history.back();
	</script>

</body>
</html>