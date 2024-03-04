<%@ page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>BOARD PORTAL</title>
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<script src="http://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css" />
<script defer src="js/ie.js"></script>
</head>
<body>
	<header>
		<div class="inner">
			<h1 style="color:white">
				ASSETTO CORSA <br><span style="color: red">COMPETIZIONE</span><br>GALLERY
			</h1>

			<ul id="gnb">
				<li><a
					href="https://assettocorsa.gg/assetto-corsa-competizione/">OFFICIAL</a></li>
				<li><a href="https://www.youtube.com/@assettocorsaofficial">YOUTUBE</a></li>
				<li><a href="./_board/list.jsp">COMMUNITY</a></li>
			</ul>

			<ul class="util">
				<%
				Member member = (Member) session.getAttribute("member");
				if (member != null) {
				%>
				<form class="d-flex" action="./_member/logout.jsp" method="post">
					<div style="color: white; display: flex; align-items: center;">
						<li><%=member.getId()%>님 로그인을 환영합니다</li> &nbsp;
						<button type="submit" class="logout-button"
							style="color: black; padding: 10px 10px; border: none; border-radius: 5px; cursor: pointer;">로그아웃</button>
					</div>
				</form>
				<%
				} else {
				%>
				<li><a href="./_member/login_main.jsp">Login</a></li>
				<%
				}
				%>

			</ul>
		</div>
	</header>

	<figure>
		<video src="img/GT2 DLC Pack Console Launch Trailer.mp4" autoplay
			muted loop></video>
	</figure>

	<section>
		<div class="inner">
			<h1>RECENT NEWS</h1>
			<div class="wrap">
				<article>
					<div class="pic">
						<img src="img/news1.png" alt="첫 번째 콘텐츠 이미지" />
					</div>
					<h2>
						<a href="https://assettocorsa.gg/fia-motorsport-games-2024/">FIA
							MOTORSPORT GAMES 2024</a>
					</h2>
					<p>13 February 2024 ACC, News</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/news2.png" alt="두 번째 콘텐츠 이미지" />
					</div>
					<h2>
						<a href="https://assettocorsa.gg/the-gt2-pack-dlc/">THE GT2
							PACK</a>
					</h2>
					<p>16 January 2024 ACC, DLC</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/news03.jpg" alt="세 번째 콘텐츠 이미지" />
					</div>
					<h2>
						<a
							href="https://assettocorsa.gg/synergy-unveiled-kunos-simulazioni-and-ferrari/">SYNERGY
							UNVEILED KUNOS SIMULAZIONI AND FERRARI</a>
					</h2>
					<p>10 July 2023 ACC, News</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/news4.png" alt="네 번째 콘텐츠 이미지" />
					</div>
					<h2>
						<a href="https://assettocorsa.gg/bmw-m-sim-time-attack/">BMW M
							SIM TIME ATTACK</a>
					</h2>
					<p>3 July 2023 ACC, Esports</p>
				</article>
			</div>
		</div>
	</section>
</body>
</html>
