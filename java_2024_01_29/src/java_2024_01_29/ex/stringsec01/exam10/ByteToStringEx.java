package sec01.exam10;

public class ByteToStringEx {

	public static void main(String[] args) {

		String sub = "자바 프로그램";
		System.out.println(sub.charAt(3));

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97 };

		String str = new String(bytes, 0, 2); // bytes 뒤에 0만 쓸 경우 ▷ The constructor String(byte[], int) is deprecated
												// since version 1.1
		System.out.println(str);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

		char[] chars = { 'H', 'e', 'l', 'l', 'o' };
		str = new String(chars);
		System.out.println(str);
	}

}
