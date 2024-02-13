package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("BLUE"); // 이걸 대문자로 바꾸면 해시코드 값이 바뀌기 때문에 동등 객체로 볼 수가 없는 거임
		Member obj3 = new Member("red");

		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());

		System.out.println(obj1.hashCode()); // 정수로 해시코드 나타냄

		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

//		System.out.println(obj1);

		if (obj1.id.equalsIgnoreCase(obj2.id)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");

		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");

		}

	}

}
// 두 객체가 같다는 걸 어떻게 알아먹을래?
// 우리가 만든 Member라는 객체가 같다는 걸 비교하기 위해서는 해시코드 값과 equals의 비교값이 같아야 한다는 거임