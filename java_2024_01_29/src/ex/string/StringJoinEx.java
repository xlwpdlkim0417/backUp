package ex.string;

import java.util.ArrayList;
import java.util.List;

public class StringJoinEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("나는");
		list.add("라면을");
		list.add("좋아합니다");
		String msg = String.join(" ", list); // 이거 중간에 띄어쓰기는 조건을 줬기 때문에 그럼
		System.out.println(msg);

		String msg2 = String.join(".", "www", "naver", "com");
		System.out.println(msg2);

	}

}
