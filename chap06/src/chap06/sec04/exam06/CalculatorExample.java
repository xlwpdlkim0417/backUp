package sec04.exam06;
//메소드 오버로딩

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalcu = new Calculator();
		// Calculator 클래스의 객체를 참조하는 myCalcu애
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장

		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		// double 타입 변수 result1에
		// myCalcu.로 areaRectangle() 메소드 호출
		// 매개 변수로 전달된 값으로 메소드 실행 ▷ result1에 리턴값 저장

		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		// double 타입 변수 result2에
		// myCalcu.로 areaRectangle() 메소드 호출
		// 매개 변수로 전달된 값으로 메소드 실행 ▷ result2에 리턴값 저장

		// 결과출력
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
	}
}