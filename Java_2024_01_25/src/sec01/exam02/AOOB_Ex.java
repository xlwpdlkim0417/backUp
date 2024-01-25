package sec01.exam02;

public class AOOB_Ex {

	public static void main(String[] args) {

		try {

			String data1 = args[0];
			// java.lang.ArrayIndexOutOfBoundsException
			// Index 0 out of bounds for length 0
			// 명령 라인 실행과 관련 있음
			// 해결 방법 : run configuration > 2nd tab > program arguments에 정보 입력

			String data2 = args[1];

			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("예외 발생!");
			System.out.println();
			e.printStackTrace();// 메모리에 쌓인걸 따라가면서 프린트해줘!
			System.out.println();
			System.out.println(e.getMessage()); // 이렇게 하면 빨간색의 오류가 아니라 평범한 글자로 프린트

		}

	}

}
// try-catch 구문으로 예외 발생 알림