<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onclick="test()">클릭</button>
	<h1 id="title">헬로우 JSP</h1>
	<h1 class="title2">헬로우 JSP2</h1>
	<script type="text/javascript">
		function test() {
			let str = document.getElementById("title");
			let str2 = document.querySelector("#title");
			let str3 = document.querySelector(".title2");
			//let은 변수를 지정한다
			//id로 element를 가져오는데 "title"을 가져온다는 말임
			console.log("안녕 JSP", '이것도 나오나', str, str2, str3);
			str3.innerHTML = "테스트";
			//이건 값을 바꾸는 거임
		}
	</script>
</body>
</html>