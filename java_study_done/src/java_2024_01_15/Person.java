package _2024_01_15;

public class Person {

	final static public double PI1 = 3.141592;
	public static final double PI = 3.141592; // 상수
	// PI 바로 앞에 double은 위치 고정인데 그 앞에는 위치가 고정은 아님 예를 들어서 접근제한자가 맨 앞일 필요는 없기는함

	final String name;

	public Person(String name) {
		this.name = name; // 생성자도 못바꿈 final String name = "이름"
	}

	public static void main(String[] args) {

		System.out.println(Math.PI); // API에 이렇게 들어가있는 것들이 있으니 참조

		Person person = new Person("홍길동"); // 이것도 그냥은 못쓰고 final String name = "이름"; 일 때 괄호 안에 "이름"을 써줘야함 final 붙은건 우리가
											// 임의로 바꿀 수가 없음 아니면 앞에서 정의 안했으면 여기서 객체 만들 때 괄호 안에 정의 한 번 해줄 수 있음
//		person.name = "홍길동";	//final은 앞에 final 붙은 데에서 줘야함

		final int x; // 한 번만
		x = 300;

	}

}
