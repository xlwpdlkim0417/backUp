package sec02.exam01;
//일반 예외 처리

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
// java.lang.String2 클래스가 존재하지 않으므로 ClassNotFoundException 예외 발생