package _2024_01_11;

public class Passing1 {

	public static int method1(int y) { // 함수, 메소드 //y도 지역변수(이자 매개변수) 단, 호출한 곳에서 값을 넘겨 줘야 함
//		System.out.println(3);
		y += 1;
		return y; // 리턴=호출 된 애가 리턴함 / 내가 알기론 void는 리턴 별도로 안써도 되지 않나? ㅇㅋ 맞음 void는 리턴을 안써도 됨
	}

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);

		int x = 100; // 지역 변수 = 그 블록에서만 생존한다
//		x = method1(x); // x의 값을 메소드에 넣어서 증가시키고 다시 x에 저장하고 싶을 때
		int num = method1(x); // 호출 (이름으로 실행시킨다) 괄호 안에는 리터럴 숫자 혹은 변수 들어갈 수 있음
//		System.out.println(4);
		System.out.println("리턴값:" + num);
		System.out.println("x값:" + x);

	}

}
