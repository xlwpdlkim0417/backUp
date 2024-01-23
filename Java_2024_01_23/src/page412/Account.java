package page412;

//class Name {
//}
//	이 두 클래스 여기에다 써도 class의 필드 선언 오류 나지 않음
//class School {
//}

public class Account {

	Name name = new Name();
	static School school = new School();
	// No enclosing instance of type Account is accessible. Must qualify the
	// allocation with an enclosing instance of type Account (e.g. x.new A() where x
	// is an instance of Account).

	class Name { // 중첩이 되면 종속이 됨 바깥이 객체 생성이 되면 내부도 객체 생성이 가능
		// static은 Account 클래스의 객체 생성과 상관없이 사용 가능
	}

	static class School { // 내부에서는 static 필드랑 static 클래스랑 연결됨 이거 문제 해결하려면 static 붙이면 됨
	}

}
