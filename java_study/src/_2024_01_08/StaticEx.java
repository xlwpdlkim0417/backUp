package _2024_01_08;

public class StaticEx {

	
	static int y; //정적 필드 (변수 아님 필드임 main의 int x = 100; 이런 로컬 변수랑 다른거임) 방이 하나라는 말 이러한 정적 필드를 main에서도 갖다쓸 수 있고 m1 메소드에서도 갖다쓸 수 있음
	
	
	public static void main(String[] args) {
		
		System.out.println(y);
		y=300;

		int x = 100; //main 메소드의 지역 변수 (로컬 변수)
		m1(100);
		System.out.println(x);
		

	}

	public static void m1(int x) { //매개 변수 (일종의 지역 변수)
		System.out.println(y);
		
		System.out.println(x);
		
		x=200; //여기서 x값을 200으로 설정해도 main으로 넘겨주지는 않음

	}
	

}
