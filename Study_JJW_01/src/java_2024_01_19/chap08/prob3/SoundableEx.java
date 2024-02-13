package java_2024_01_19.chap08.prob3;

class Cat implements Soundable { // 3번 : 1번 + 2번 근거로 class 만들고 Soundable 인터페이스 implements 해줌
									// Soundable soundable = new Cat(); 가능
									// 이름이 빨개졌음 왜? 추상메소드 ▷ 실체메소드 필요함

	@Override
	public String sound() { // 실체 메소드임 자동으로 만들어도 리턴값 있지? 아까 생각했던 대로? 리턴 값이 뭐야? 메소드 실행하면 보내주는 값이잖음? 여기서는
							// soundable.sound()임
		return "야옹";
	}

}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}

}

public class SoundableEx {

	public static void printSound(Soundable soundable) { // 2번 : Soundable soundable 확인 ▷ Soundable 인터페이스 뭔지 확인
		// ▷ String sound(); 이거 추상메소드구나! 근데 void 아니라서 리턴 타입이겠네 추상메소드면 메소드 실행 내용이 필요할텐데
		// Soundable soundable = new Cat(); 이게 아래 soundable.sound() 가능하게 해줌
		//
		System.out.println(soundable.sound());

	}

	public static void main(String[] args) {

		printSound(new Cat()); // 1번 : 메소드 static이라서 그냥 소환 가능 그 안에 객체 들어가있음 그리고 최소한 class Cat class Dog 필요하겠네
								// 왜? 생성자 있으니까
		printSound(new Dog());
	}

}
