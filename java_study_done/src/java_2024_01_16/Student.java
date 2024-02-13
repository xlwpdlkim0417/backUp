package _2024_01_16;

public class Student extends People {
	String hakbun;

	public Student(String hakbun) { // 부모가 생성자를 만들었으면 자식이 호출해주어야함
		super("홍길동"); // 부모의 생성자 호출 (여기서는 기본생성자 호출) > 오류 해결 방법 : 변수생성자에 맞춰서 변수 넣어주면 됨
		this.hakbun = hakbun;
	}

	@Override
	void method1() {
		super.method1(); // 부모의 메소드 실행 (생략 가능)
		//
	}

}
