<%@ page import="java.time.LocalDate"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%@ page import="dto.Acc"%>
<%@ page import="dao.AccDao"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

LocalDate todayo = LocalDate.now();
LocalDate threeMonthsAgo = todayo.minusMonths(3);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
String todayStr = todayo.format(formatter);
String samMonthStr = threeMonthsAgo.format(formatter);

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

//달력에 표시할 데이터 불러오기
AccDao dao = AccDao.getInstance();
List<Acc> list = dao.selectByMonth(year, month); // 이 메소드는 해당 월의 모든 Acc 데이터를 불러오는 것으로 가정합니다.

// 출력 알고리즘(td의 개수 구하기)
int startBlankCnt = firstDay - 1;
// 일단 내려가서 정보 확인 전에 이름으로만 유추해보자면 달력 시작 전에 빈 칸 (이전달 때문에 생긴 블랭크)인 듯?
// 예를 들어서 1~7까지가 일요일에서 토요일까지인거고 숫자가 7일 때 블랭크는 6이고 일월화수목금까지 블랭크인거지
int endBlankCnt = 0;

if ((startBlankCnt + lastDate) % 7 != 0) {
	endBlankCnt = 7 - (startBlankCnt + lastDate) % 7;
}
int tdCnt = startBlankCnt + lastDate + endBlankCnt;
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

label {
	display: block;
	font: 1rem 'Fira Sans', sans-serif;
}

input, label {
	margin: 0.4rem 0;
}

.highlight {
	background-color: yellow;
}


</style>
</head>

<body>
	<div class="container mt-3">
		<div class="mt-3 mb-3 p-3 d-flex justify-content-between">
			<span> <a class="btn btn-outline-dark btn-sm"
				href="<%=request.getContextPath()%>/myCalendar.jsp?year=<%=year%>&month=<%=month - 1%>">
					[이전달] </a>
			</span>  <span
				class="fw-bold fs-3"><%=year%>년 <%=month + 1%>월</span> <span>
				<a class="btn btn-outline-dark btn-sm"
				href="<%=request.getContextPath()%>/myCalendar.jsp?year=<%=year%>&month=<%=month + 1%>">
					[다음달] </a>
			</span>
		</div>
		<div style="display: flex;">
		Start date <input type="date" id="start" name="trip-start" value="<%=samMonthStr%>" min="2018-01-01" max="<%=todayStr%>" onchange="getFromServer()" />
		End date <input type="date" id="end" name="trip-end" value="<%=todayStr%>" min="2018-01-01" max="<%=todayStr%>" />
		</div>
		
		<div style="display: flex;">
		<div id="target" style="border: solid 1px black; overflow: auto; height: 630px; flex: 1;">
		<button type="button" onclick="getFromServer()">GET DATA</button>
		</div>







			<div style="flex: 4;">
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
							if (i > startBlankCnt && i <= startBlankCnt + lastDate) {
								int day = i - startBlankCnt; // 현재 날짜 계산
						%>
						<td><a type="button"
							onclick="openCenteredWindow('insert_form.jsp?year=<%=year%>&month=<%=month + 1%>&day=<%=day%>', '800', '600')">
								<%=day%>
						</a>
							<div style="text-align: center;">
								<%
								// 현재 날짜에 해당하는 Acc 데이터 찾기
								for (Acc acc : list) {
									if (acc.getDay() == day) {
										// 현재 날짜와 일치하는 Acc 데이터를 여기에 출력

										out.println("<div >" + acc.getMulname() + "</div>");
								%>
								<a type="button"
									onclick="location.href='delete.jsp?num=<%=acc.getNum()%>'">
									<%
									out.println("<div class=yourDataClass>" + acc.getTrname() + "</div>");
									%>

								</a>
								<%
								// 필요한 경우 더 많은 정보 출력
								break; // 일치하는 첫 번째 데이터만 출력하고 루프 종료

								}
								}
								%>
							</div></td>
						<%
						} else {
						%>
						<td>&nbsp;</td>
						<%
						}
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
</div>

	<script>
	
	document.addEventListener("mouseover", function(event) {
	    if (event.target.matches(".yourDataClass")) { // .yourDataClass는 불러온 데이터에 할당한 클래스입니다.
	        const wordToHighlight = event.target.textContent;
	        document.querySelectorAll(".yourDataClass").forEach(function(node) {
	            if (node.textContent === wordToHighlight) {
	                node.classList.add("highlight");
	            }
	        });
	    }
	});

	document.addEventListener("mouseout", function(event) {
	    if (event.target.matches(".yourDataClass")) {
	        document.querySelectorAll(".highlight").forEach(function(node) {
	            node.classList.remove("highlight");
	        });
	    }
	});
	
function getFromServer() {
    var startDate = document.getElementById("start").value;
    if (startDate) {
        const xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            document.getElementById("target").innerHTML = this.responseText;
        }
        xhttp.open("GET", "NewFile.jsp?trip-start=" + startDate, true);
        xhttp.send();
    }
}

</script>


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