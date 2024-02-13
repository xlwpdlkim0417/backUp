package sec01.exam02;

public class MyClass implements InterTest {

	@Override
	public void test1() { // default 메소드 재정의
//		InterTest.super.test1();
		System.out.println("새로운 test1()");
	}

	@Override
	public void test() {
	}

	public static void main(String[] args) {

		InterTest it = new MyClass();
		it.test1(); // default 메소드
		InterTest.test4(); // static 메소드 (InterTest 인터페이스 참조) 객체 생성과 관계 없이 불러와서 쓸 수 있음

	}

}
// default 메소드는 왜 만들었을까?
// 인터페이스를 만들어서 오랫동안 썼는데, 추가하고 싶은게 생겼음
// 기존 인터페이스를 수정하면 연결되어있는 클래스를 전부 수정해야 하니까 그걸 피하고 싶음
// 그래서 default 메소드로 추가하고 필요한 곳에서 재정의 해서 사용함
// 기존 애들은 놔두면서 새로운 걸 추가할 수 있는 방법으로 고안되지 않았을까