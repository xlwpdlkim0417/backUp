package chap03.sec02.exam05;
//char 타입의 산술 연산

public class CharOperationExample {

	public static void main(String[] args) {

		char c1 = 'A' + 1; // ← char c1 = 66; 왜? 문자 'A'의 유니코드 값 ▷ 65
		// (65 + 1) = 66 ▷ char 타입으로 66의 값은 문자 리터럴 'B'에 해당함
		// p.117 ▷ 리터럴 간의 연산은 컴파일 단계에서 수행하기 때문에 타입 변환이 없습니다.
		// 이게 유니코드 값을 가지는 char 타입 변수 c1에 저장하기 때문에 변환이 없나?
		// 타입이 다른데 어떻게 한 쪽으로 변화를 가지지 않을 수 있지?

		// [GPT]
		// 이러한 상황에서는 컴파일러가 리터럴 간의 연산을 먼저 수행하고, 그 결과가 적절한 타입으로 변환되어 변수에 할당됩니다.
		// 따라서 여기서는 명시적인 캐스팅이나 형변환 없이도 컴파일이 가능합니다.
		// 변수에 대한 연산은 런타임 시에 이루어지기 때문에 컴파일러는 이를 미리 알 수 없습니다. ▷ 강제 타입 변환 필요 이유
		// 따라서 이 경우는 컴파일 에러가 발생하게 됩니다.

		char c2 = 'A'; // char 타입 변수 c2에 문자 리터럴 'A' 저장
//		char c3 = c2 + 1;	//Type mismatch: cannot convert from int to char
		// char 타입 변수 c3에 (char 타입 변수 c2 + 정수 리터럴 1) 연산식 값 저장
		// (괄호) 내부 연산은 (char 타입 + int 타입) 결과값은 int 타입으로 자동 타입 변환
		// 그래서 char 타입 변수 c1에 저장 불가

		System.out.println("c1: " + c1); // char 타입 변수 c1에 저장된 값 출력
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);
	}
}