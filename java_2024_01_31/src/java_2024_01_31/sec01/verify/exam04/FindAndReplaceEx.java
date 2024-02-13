package sec01.verify.exam04;

public class FindAndReplaceEx {

	public static void main(String[] args) {

		String str = "모든 프로그램은 자바 언어로";
		int index = str.indexOf("자바");
		// 위치를 정수로
		System.out.println(index);
		str = str.replaceAll("자바", "java");
		// 새로운 문자열
		System.out.println(str);

	}

}
