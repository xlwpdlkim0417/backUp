package java_2024_01_31.sec01.verify.exam04;

public class MemberEx {

	public static void main(String[] args) {

		Member member = new Member("blue", "이파란");
		System.out.println(member);

		Class clazz = Member.class;
		System.out.println(clazz);
		System.out.println(clazz.getName());
		// 이런 식으로 클래스 정보는 얻을 수 있는데 클래스의 객체는 얻을 수 없음
	}
}