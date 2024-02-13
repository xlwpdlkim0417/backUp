package java_2024_01_15;

public class SingletonEx {

	public static void main(String[] args) {

//		Singleton sing = new Singleton(); // 이거 안되는 이유가 Singleton 클래스에서 생성자가 private라서
		Singleton sing2 = Singleton.getInstance(); // 이렇게만 사용할 수 있음
		Singleton sing3 = Singleton.getInstance();

		if (sing2 == sing3) { // 객체의 메모리 주소 비교
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");
		}

		if (sing2.equals(sing3)) { // 객체 자체가 같은지 (여기서는 무의미)
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");
		}

	}

}
// 싱글톤은 어디에 쓸 수 있을까?