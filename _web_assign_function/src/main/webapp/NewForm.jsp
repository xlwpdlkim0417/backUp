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
String num = "";
String name = "";
String kor = "";
String eng = "";
String math = "";
%>

	<form method="get" id="frm">
		번호 <input type="text" name="num" value="<%=num%>"/><br>
		이름 <input type="text" name="name" value="<%=name%>"/><br>
		국어 <input type="text" name="kor" value="<%=kor%>"/><br>
		영어 <input type="text" name="eng" value="<%=eng%>"/><br>
		수학 <input type="text" name="math" value="<%=math%>"/><br>
		
	</form>
	<input type="button" onclick="del()" value="삭제I"/>
	<button onclick="del()">삭제B</button>
	<script type="text/javascript">
	function del(){
		/* delete는 자바스크립트의 예약어라서 사용 불가능 */
		document.getElementById('frm').action='delete.jsp';
		document.getElenemtById('frm').submit();
	}
	function update(){
		document.querySelector('#frm').action='update.jsp';
		document.querySelector('#frm').submit();
	}
	</script>
	<a href="index.jsp">목록으로</a>
</body>
</html>