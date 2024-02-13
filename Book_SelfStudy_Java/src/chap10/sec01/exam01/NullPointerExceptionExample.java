package chap10.sec01.exam01;
//NullPointerException

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		// String 타입 변수 data 선언
		// null 값 저장

		System.out.println(data.toString());
		// 로컬 변수 data가 참조하는 객체를 문자열로 프린트
		// NullPointerException 예외 발생
	}
}
// toString() 메소드 : 'Object' 클래스에서 정의되는 객체를 문자열로 표현하는 데 사용되는 메소드
// 객체의 클래스 이름, 해시코드를 기반으로 한 식별자를 문자열로 반환