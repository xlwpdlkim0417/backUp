package sec04.exam02;
//매개 변수의 개수를 모를 경우

public class ComputerExample {

	public static void main(String[] args) {

		Computer myCom = new Computer();
		// Computer 클래스의 객체를 참조하는 myCom에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장

		int[] values1 = { 1, 2, 3 };
		// int 타입 배열 values1에 값 목록 저장
		int result1 = myCom.sum1(values1);
		// int 타입 result1에 myCom + (.)로 Computer 클래스의 sum1() 메소드 호출
		// 매개 변수가 배열 ▷ 매개 변수로 메소드 호출 전에 배열 생성 필요
		// 매개 변수로 메소드 실행 후 결과값 리턴
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		// int 타입 result2에 myCom + (.)로 Computer 클래스의 sum1() 메소드 호출
		// 매개 변수가 배열 ▷ 매개 변수로 메소드 호출 전에 배열 생성 필요
		// 매개 변수로 메소드 실행 후 결과값 리턴
		// 매개 변수에 new 연산자 등장 이유는? ▷ 배열 생성 위해서
		System.out.println("result2: " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		// int 타입 변수 result3에 myCom + (.)로 Computer 클래스의 sum2() 메소드 호출
		// 매개 변수가 배열 ▷ ...배열 ▷ 값 목록 직접 전달
		// 매개 변수로 메소드 실행 후 결과 값 리턴
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		// int 타입 변수 result4에 myCom + (.)로 Computer 클래스의 sum2() 메소드 호출
		// 매개 변수가 배열 ▷ ...배열 ▷ 값 목록 직접 전달
		// 매개 변수로 메소드 실행 후 결과 값 리턴
		System.out.println("result4: " + result4);
	}
}