package sec01.verify.exam04;

public class ByteToStringeX {

	public static void main(String[] args) {

		byte[] bytes = { 73, 32, 108, 111, 118 };

		String str = new String(bytes);
		//String() 이라는 생성자에 byte 타입도 넣을 수 있음

		System.out.println(str);

	}

}
