package sec02.exam02;
//필드값 출력

public class FieldInitValueExample {

	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();
		// 참조 차입 FieldInitValue 클래스를 참조하는 변수 fiv에
		// new 연산자로 객체 생성 후 번지 저장

		System.out.println("byteField: " + fiv.byteField);
		// 참조 타입 FieldInitValue 클래스의 인스턴스 fiv를 통해 참조 타입 FieldInitValue의 필드값 읽기
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		// 참조 타입 FieldInitValue 클래스의 인스턴스 fiv를 통해 참조 타입 FieldInitValue의 필드값 읽기
		// 초기값 = false
		System.out.println("charField: " + fiv.charField);
		// 참조 타입 FieldInitValue 클래스의 인스턴스 fiv를 통해 참조 타입 FieldInitValue의 필드값 읽기
		// 초기값 = \u0000 (빈 공백)
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		// 참조 타입 FieldInitValue 클래스의 인스턴스 fiv를 통해 참조 타입 FieldInitValue의 필드값 읽기
		// 초기값 = null
		System.out.println("referenceField: " + fiv.referenceField);
	}
}