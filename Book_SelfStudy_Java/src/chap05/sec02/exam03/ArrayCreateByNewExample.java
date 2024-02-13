package chap05.sec02.exam03;
//new 연산자로 배열 생성

public class ArrayCreateByNewExample {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		// 길이가 정해진 배열
		// int 타입 배열을 참조하는 참조 타입 변수 arr1에 new 연산자로 길이 3의 배열 객체 생성 후 저장

		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산자
			System.out.println("arr1[" + i + "] : " + arr1[i]);
			// 참조 타입 변수 arr1이 참조하는 int 타입 배열 객체 인덱스[i] 저장 값 출력
		} // for문 종료

		arr1[0] = 10; // 참조 변수 arr1가 참조하는 int 타입 배열 객체 인덱스 [0]번에 10 저장
		arr1[1] = 20; // 참조 변수 arr1가 참조하는 int 타입 배열 객체 인덱스 [1]번에 20 저장
		arr1[2] = 30; // 참조 변수 arr1가 참조하는 int 타입 배열 객체 인덱스 [2]번에 30 저장

		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타이 변수 i 증가 연산식
			System.out.println("arr1[" + i + "] : " + arr1[i]);
			// 참조 타입 변수 arr1이 참조하는 int 타입 배열 객체 인덱스[i] 저장 값 출력
		} // for문 종료

		double[] arr2 = new double[3];
		// double 타입 배열을 참조하는 참조 타입 변수 arr2에 new 연산자로 길이 3의 배열 객체 생성 후 저장

		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타비 변수 i에 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산식
			System.out.println("arr2[" + i + "] : " + arr2[i]);
			// 참조 타입 변수 arr2가 참조하는 double 타입 배열 객체 인덱스[i] 저장 값 출력
		} // for문 종료

		arr2[0] = 0.1; // 참조 타입 변수 arr2가 참조하는 double 타입 배열 객체 인덱스 [0]번에 0.1 저장
		arr2[1] = 0.2; // 참조 타입 변수 arr2가 참조하는 double 타입 배열 객체 인데스 [1]번에 0.2 저장
		arr2[2] = 0.3; // 참조 타입 변수 arr2가 참조하는 double 타입 배열 객체 인데스 [2]번에 0.3 저장
		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타비 변수 i에 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산식
			System.out.println("arr2[" + i + "] : " + arr2[i]);
			// 참조 타입 변수 arr2가 참조하는 double 타입 배열 객체 인덱스[i] 저장 값 출력
		} // for문 종료

		String[] arr3 = new String[3];
		// Sting 타입 배열을 참조하는 참조 타입 변수 arr3에 new 연산자로 길이 3의 배열 객체 생성 후 저장

		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타비 변수 i에 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산식
			System.out.println("arr3[" + i + "] : " + arr3[i]);
			// 참조 타입 변수 arr3가 참조하는 String 타입 배열 객체 인덱스[i] 저장 값 출력
		} // for문 종료

		arr3[0] = "1월"; // 참조 타입 변수 arr3가 참조하는 String 타입 배열 객체 인덱스 [0]번에 문자열 "1월" 저장
		arr3[1] = "2월"; // 참조 타입 변수 arr3가 참조하는 String 타입 배열 객체 인덱스 [1]번에 문자열 "2월" 저장
		arr3[2] = "3월"; // 참조 타입 변수 arr3가 참조하는 String 타입 배열 객체 인덱스 [2]번에 문자열 "3월" 저장

		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타비 변수 i에 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산식
			System.out.println("arr3[" + i + "] : " + arr3[i]);
			// 참조 타입 변수 arr3가 참조하는 String 타입 배열 객체 인덱스[i] 저장 값 출력
		} // for문 종료
	}
}