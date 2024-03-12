package optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String str = "Hello, World!";
//		null이 아닌 값을 가지는 문자열 변수
		Optional<String> optionalStr = Optional.of(str);
//		Optional 객체 생성, 값이 null이 아니므로 of() 메소드 사용
		System.out.println(optionalStr);

		String nullStr = null;
//		null 값을 가지는 문자열 변수
		Optional<String> optionalNullStr = Optional.ofNullable(nullStr);
//		Optional 객체 생성, 값이 null이므로 ofNullable() 메소드 사용
		System.out.println(optionalNullStr);
		Optional<String> emptyOptional = Optional.empty();
//		값을 갖지 않는 빈 Optional 객체 생성
		System.out.println(emptyOptional);
	}

}
