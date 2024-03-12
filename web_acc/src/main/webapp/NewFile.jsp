<%@ page import="java.time.LocalDate"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%@ page import="dto.Acc"%>
<%@ page import="dao.AccDao"%>
<%@ page import="java.util.*"%>
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
	<%
	String start = request.getParameter("trip-start");

	List<Acc> resultList = dao.getStatistics(start, todayStr);
	%>
	<h2>통계 결과</h2>

	<%
	for (Acc accc : resultList) {
	%>

	<div class=yourDataClass><%=accc.getTrname()%></div>


	<%=accc.getMulname()%>

	<%=accc.getCount()%><br>

	<%
	}
	%>


</body>
</html>