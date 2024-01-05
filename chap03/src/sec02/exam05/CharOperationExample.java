package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {

		char c1 = 'A' + 1; // char c1 = 66; 왜? 문자 'A'는 유니코드 65 값을 가짐 // 리터럴 (연산) 리터럴 = 타입 변환 없음
		char c2 = 'A';
		// char c3 = c2 + 1; 이거 char 변수가 산술 연산에 사용되면 int 타입으로 변환되므로 연산 결과는 int 타입
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		// System.out.println("c1: " + c1);

	}

}
