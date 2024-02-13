package _2024_01_08;

public class StackEx {

	public static void main(String[] args) {

		int age = 32;
		String name = "강하나";

//		int[] intArray = null;
//		intArray[0] = 10;

//		String str = null;
//		System.out.println(str.length()); // 위랑 이거랑 둘 다 NullponitException 오류남 만약에 "강하나" 넣으면 3이라는 값이 나옴

		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1 == name2); // 메모리 번지수가 같다는 말임
		System.out.println(name1.equals(name2));

		String name3 = new String("신용권");
		String name4 = new String("신용권");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

	}

}
