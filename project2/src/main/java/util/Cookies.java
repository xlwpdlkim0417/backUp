package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;
import java.util.Map;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.IOException;

public class Cookies {
	//내가 지은 클래스 이름

	private Map<String, Cookie> cookieMap = new java.util.HashMap<String, Cookie>();
	// 문자열을 주면 쿠키를 꺼내옴

	public Cookies(HttpServletRequest request) {
		// 리퀘스트 기본 객체를 매개 변수로 집어 넣겠다
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookieMap.put(cookies[i].getName(), cookies[i]);
				//쿠키 이름과 쿠키 객체를 해쉬맵에 넣는 거임
			}
		}
	}

	public Cookie getCookie(String name) { // 쿠키 자체를 꺼내줌
		return cookieMap.get(name);
		//해쉬 맵에서 이름으로 쿠키를 꺼내거나
	}

	public String getValue(String name) throws IOException { // 쿠기 밸류 꺼내줌
		Cookie cookie = cookieMap.get(name);
		if (cookie == null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(), "utf-8");
	}

	public boolean exists(String name) { // 쿠키 이름 중에 그 이름이 있니 없니
		return cookieMap.get(name) != null;
	}

	public static Cookie createCookie(String name, String value) throws IOException {
		return new Cookie(name, URLEncoder.encode(value, "utf-8"));
	}

	public static Cookie createCookie(String name, String value, String path, int maxAge) throws IOException {
		// 주로 사용할 쿠키 생성 메소드
		// Cookies가 아니라 원래 서블릿에서 지원하고 있는 생성 장치
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}

	public static Cookie createCookie(String name, String value, String domain, String path, int maxAge)
			throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		cookie.setDomain(domain);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}

}
