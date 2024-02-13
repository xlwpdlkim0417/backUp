package java_2024_01_29.ex.string;

public class StringTrimEx {

	public static void main(String[] args) {

		String str = "    가나  다        ";

		System.out.println(str.length());
		System.out.println(str.trim().length());
		// 앞 공백, 뒤 공백 없애는 명령어

		String str1 = String.valueOf(10);
		System.out.println(str1);

	}

}
