<%@ page import="dto.Acc"%>
<%@ page import="dao.AccDao"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

int year = 0;
int month = 0; // 0 ~ 11

// 년도, 월 중 하나라도 지정(넘겨져 오지)되지 않으면 오늘날짜 기준으로 월달력 출력
if (request.getParameter("year") == null || request.getParameter("month") == null) {
	Calendar today = Calendar.getInstance();
	year = today.get(Calendar.YEAR);
	month = today.get(Calendar.MONTH);
} else {
	// 출력하고자 하는 달력의 년도와 월
	year = Integer.parseInt(request.getParameter("year")); // 2022,..
	month = Integer.parseInt(request.getParameter("month")); // 0 ~ 11

	// 이전달 클릭 year, month-1 / 다음달 클릭 year, month+1
	// -1 -> 11,year--  12 -> 0,year++
	if (month == -1) {
		month = 11;
		year = year - 1;
	}
	if (month == 12) {
		month = 0;
		year = year + 1;
	}
}
// 출력하고자 달의 1일 객체 + 1일 요일 + 마지막 날짜
Calendar firstDate = Calendar.getInstance();
firstDate.set(Calendar.YEAR, year);
firstDate.set(Calendar.MONTH, month);
firstDate.set(Calendar.DATE, 1);
int firstDay = firstDate.get(Calendar.DAY_OF_WEEK); // 1일의 요일 정보(1일,2월,....,7토)
int lastDate = firstDate.getActualMaximum(Calendar.DATE);

// 출력 알고리즘(td의 개수 구하기)
int startBlankCnt = firstDay - 1;
// 일단 내려가서 정보 확인 전에 이름으로만 유추해보자면 달력 시작 전에 빈 칸 (이전달 때문에 생긴 블랭크)인 듯?
// 예를 들어서 1~7까지가 일요일에서 토요일까지인거고 숫자가 7일 때 블랭크는 6이고 일월화수목금까지 블랭크인거지
int endBlankCnt = 0;

if ((startBlankCnt + lastDate) % 7 != 0) {
	endBlankCnt = 7 - (startBlankCnt + lastDate) % 7;
}
int tdCnt = startBlankCnt + lastDate + endBlankCnt;
System.out.println(lastDate);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
html, body {
	height: 100%;
	margin: 0px;
}

td {
	width: 100px;
	height: 100px;
}

th {
	height: 30px;
	font-weight: normal;
}
</style>
</head>

<body>
	<div class="container mt-3">
		<div class="mt-3 mb-3 p-3 d-flex justify-content-between">
			<span> <a class="btn btn-outline-dark btn-sm"
				href="<%=request.getContextPath()%>/myCalendar.jsp?year=<%=year%>&month=<%=month - 1%>">
					[이전달] </a>
			</span> <span class="fw-bold fs-3"><%=year%>년 <%=month + 1%>월</span> <span>
				<a class="btn btn-outline-dark btn-sm"
				href="<%=request.getContextPath()%>/myCalendar.jsp?year=<%=year%>&month=<%=month + 1%>">
					[다음달] </a>
			</span>
		</div>
		<div>
			<table class="table text-left table-bordered">
				<tr class="table-light text-center fs-5 tr-h">
					<th class="text-danger">일</th>
					<th>월</th>
					<th>화</th>
					<th>수</th>
					<th>목</th>
					<th>금</th>
					<th class="text-primary">토</th>
				</tr>
				<tr>
					<%
					for (int i = 1; i <= tdCnt; i++) {
					%>
					<td>
						<%
						if (i > startBlankCnt && i <= startBlankCnt + lastDate) {
							if (i % 7 == 0) {
						%> <span class="text-primary"> <a type=button
							onclick="openCenteredWindow('member_join_form.jsp?year=<%=year%>&month=<%=month + 1%>&day=<%=i - startBlankCnt%>', '800', '600')">
								<%=i - startBlankCnt%> 토요일
						</a></span> <%
 } else if (i % 7 == 1) {
 %> <span class="text-danger"><%=i - startBlankCnt%> 일요일 </span> <%
 } else {
 %> <%=i - startBlankCnt%> 월요일에서 금요일 <%
 }
 } else {
 %> &nbsp; <%
 }
 %>
					</td>
					<%
					if (i != tdCnt && i % 7 == 0) {
					%>
				</tr>
				<tr>
					<%
					}
					}
					%>
				</tr>
			</table>
		</div>
	</div>


	<script>
function openCenteredWindow(url, width, height) {
    var left = (window.screen.width / 2) - (width / 2);
    var top = (window.screen.height / 2) - (height / 2);
    var windowFeatures = 'width=' + width + ',height=' + height + ',top=' + top + ',left=' + left + ',resizable=yes';
    window.open(url, 'popup', windowFeatures);
}
</script>
</body>
</html>