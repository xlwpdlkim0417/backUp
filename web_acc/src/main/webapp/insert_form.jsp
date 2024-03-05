<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>INPUT</title>
<link rel="icon" href="../favicon.ico" type="image/x-icon" />
<style>
body, html {
	height: 100%;
	margin: 0;
	padding: 0;
}

.centered-form {
	display: flex;
	justify-content: center;
	height: 100%;
}

.form-signin {
	width: 100%;
	max-width: 330px;
	padding: 15px;
	margin-top: 0;
}

.form-buttons {
	width: 100%;
	display: flex;
	flex-direction: column;
	gap: 10px;
	margin-top: 40px;
}

.centered-image {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.3/examples/sign-in/">
</head>
<body>

	<%
	int year = Integer.parseInt(request.getParameter("year"));
	int month = Integer.parseInt(request.getParameter("month"));
	int day = Integer.parseInt(request.getParameter("day"));
	%>


	<nav class="navbar navbar-expand-lg bg-body-tertiary"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand">Board</a>
		</div>
	</nav>

	<div class="centered-form">
		<form action="insert.jsp" method="get" class="form-signin">
			<h1 class="h3 fw-normal"><%=year%>년
				<%=month%>월
				<%=day%>일
			</h1>
			<div>
				<input type="hidden" name="year" class="form-control"
					id="floatingInput" value="<%=year%>"> 
					<input type="hidden"
					name="month" class="form-control" id="floatingInput"
					value="<%=month%>"> 
					<input type="hidden" name="day"
					class="form-control" id="floatingInput" value="<%=day%>">
			</div>
			<br>
			<div>
				<label>트랙 리스트</label> <input list="trname-options" name="trname"
					class="form-control" placeholder="옵션을 선택하세요">
				<datalist id="trname-options">
					<option value="BARCELONA">BARCELONA</option>
					<option value="BATHURST">BATHURST</option>
					<option value="BRANDS HATCH">BRANDS HATCH</option>
					<option value="CIRCUIT OF THE AMERICAS">CIRCUIT OF THE
						AMERICAS</option>
					<option value="DONINGTON PARK">DONINGTON PARK</option>
					<option value="HUNGARORING">HUNGARORING</option>
					<option value="IMOLA">IMOLA</option>
					<option value="INDIANAPOLIS">INDIANAPOLIS</option>
					<option value="KYALAMI">KYALAMI</option>
					<option value="LAGUNA SECA">LAGUNA SECA</option>
					<option value="MISANO">MISANO</option>
					<option value="MONZA">MONZA</option>
					<option value="NURBURGRING">NURBURGRING</option>
					<option value="RED BULL RING">RED BULL RING</option>
					<option value="RICARDO TORMO">RICARDO TORMO</option>
					<option value="OULTON PARK">OULTON PARK</option>
					<option value="PAUL RICARD">PAUL RICARD</option>
					<option value="SILVERSTONE">SILVERSTONE</option>
					<option value="SPA-FRANCORCHAMPS">SPA-FRANCORCHAMPS</option>
					<option value="SNETTERTON">SNETTERTON</option>
					<option value="SUZUKA">SUZUKA</option>
					<option value="WATKINS GLEN">WATKINS GLEN</option>
					<option value="ZANDVOORT">ZANDVOORT</option>
					<option value="ZOLDER">ZOLDER</option>
				</datalist>
			</div>
			<br>


			<div>
				<label>멀티 리스트</label> <input list="mulname-options" name="mulname"
					class="form-control" placeholder="옵션을 선택하세요">
				<datalist id="mulname-options">
					<option value="번개">번개</option>
					<option value="빨멀">빨멀</option>
					<option value="m2">m2</option>
					<option value="gt4">gt4</option>
					<option value="정기">정기</option>
				</datalist>
			</div>
			<div class="form-buttons">

				<button class="btn btn-dark btn-lg py-2" type="submit">확인</button>
				<button class="btn btn-secondary py-2" type="submit"
					onclick="window.close();">취소</button>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
		
	</script>
</body>
</html>
