package java_2024_02_06.sec01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// List 인터페이스를 구현하는 ArrayList 클래스의 인스턴스를 생성합니다.
		// 이 인스턴스는 String 타입의 요소를 저장할 수 있습니다.

		// 첫 번째 줄에서는 ArrayList의 인스턴스를 생성하고 List<String> 타입의 변수 list에 할당합니다.
		// ArrayList는 List 인터페이스를 구현하는 클래스로, 가변 크기의 배열로 동작하여 요소들을 순서대로 저장합니다.
		// 여기서 <String>은 제네릭 타입을 나타내며, list가 String 타입의 객체만 저장할 수 있음을 의미합니다.

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
