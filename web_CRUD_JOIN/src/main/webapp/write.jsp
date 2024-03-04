<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String memberId = (String) session.getAttribute("MEMBERID");
if (memberId == null) {
	response.sendRedirect("sessionLoginForm.jsp");
}
%>
<%
// 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
String tmp = request.getParameter("num");
int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;

/* int num = Integer.parseInt(request.getParameter("num")); */
/* 위처럼 쓰지 않은 이유는 connot parse null string으로 NumberFormatException 발생 */
/* null은 비교가 안되기 때문에 */
/* 만약 위와 같은 코드를 쓰고 싶다면 write.jsp 페이지 이동과 관련된 코드를 수정해야함 */

// 새 글쓰기 모드를 가정하고 변수 초기값 설정
String writer = "";
String title = "";
String content = "";
String action = "insert.jsp";

// 글 번호가 주어졌으면, 글 수정 모드
if (num > 0) {
	BoardDao dao = BoardDao.getInstance();
	Board board = dao.selectOne(num, false);

	writer = board.getWriter();
	title = board.getTitle();
	content = board.getContent();

	action = "update.jsp?num=" + num;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 680px;
	text-align: center;
}

th {
	width: 100px;
	background-color: cyan;
}

input[type=text], textarea {
	width: 100%;
}
</style>
</head>
<body>

	<form method="post" action="<%=action%>">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" maxlength="80"
					value="<%=title%>"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" maxlength="20"
					value="<%=session.getAttribute("MEMBERPW")%>" readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" rows="10"><%=content%></textarea>
				</td>
			</tr>
		</table>

		<br> <input type="submit" value="저장"> <input
			type="button" value="취소" onclick="history.back()">
	</form>

</body>
</html>
