<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<head>
<title>top page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style>
h1 {
	font-size: 18pt;
	font-weight: bold;
	color: gray;
}

body {
	font-size: 13pt;
	color: gray;
	margin: 5px 25px;
}

tr {
	margin: 5px;
}

th {
	padding: 5px;
	color: white;
	background: darkgray;
}

td {
	padding: 5px;
	color: black;
	background: #e0e0ff;
}

.err {
	color: red;
}
</style>
</head>
<body>
	<h1>Hello page</h1>
	<p></p>
	<table>
		<form method="post" action="insert">
			<tr>
				<td><label for="name">이름</label></td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><label for="age">연령</label></td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td><label for="email">메일</label></td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td><label for="memo">메모</label></td>
				<td><textarea name="memo" cols="20" rows="5"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" /></td>
			</tr>
		</form>
	</table>
	<hr />

	<table>

		<tr>
			<th>ID</th>
			<th>이름</th>
			<th>연령</th>
			<th>메일</th>
			<th>메모</th>
			<th>Action</th>
		</tr>

		<c:forEach var="member" items="${members}">
			<tr>

				<td><input type="hidden" name="id" value="${member.id}" />${member.id }</td>
				<td><input type="hidden" name="name" value="${member.name}" />${member.name }</td>
				<td><input type="hidden" name="age" value="${member.age}" />${member.age }</td>
				<td><input type="hidden" name="email" value="${member.email}" />${member.email }</td>
				<td><input type="hidden" name="memo" value="${member.memo}" />${member.memo }</td>
				<td>
					<form method="post" action="updateForm">
						<input type="hidden" name="id" value="${member.id}" />
						<input type="submit" name="업데이트" value="Update">
					</form>
					<form method="post" action="delete">
						<input type="hidden" name="id" value="${member.id}" /> <input
							type="submit" value="Delete" />
					</form>

				</td>

			</tr>
		</c:forEach>

	</table>


</body>
</html>
