package chap05.sec02.exam06;
//배열 속의 배열

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];
		// int 타입 2차원 배열을 참조하는 참조 변수 mathScores에
		// new 연산자로 int 타입 2차원 배열 객체 생성 후 저장
		// mathScores.length = 2
		// mathScores[인덱스].length = 3
		for (int i = 0; i < mathScores.length; i++) { // 바깥 for문 시작
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 타입 변수 mathScores가 참조하는 int 타입 2차원 배열 객체 길이보다 작다
			// 증감식
			for (int k = 0; k < mathScores[i].length; k++) { // 중첩 for문 시작
				// 초기화식
				// 조건식 : int 타입 변수 i는 참조 타입 변수 mathScores가 참조하는 int 타입 2차원 배열 객체 인덱스[i] 길이보다 작다
				// 증감식
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
				// 참조 타입 변수 mathScores가 참조하는 int 타입 2차원 배열 객체에 저장된 값 출력
			} // 중첩 for문 종료
		} // 바깥 for문 종료

		System.out.println();

		int[][] englishScores = new int[2][];
		// int 타입 2차원 배열을 참조하는 참조 변수 englishScores에
		// new 연산자로 int 타입 2차원 배열 객체 생성 후 저장
		// englishScores.length = 2
		// englishScores[].length =

		// 두 번째 차원에 대한 배열이 초기화되지 않았기 때문에 오류 발생
		// Exception in thread "main" java.lang.NullPointerException

		englishScores[0] = new int[2];
		// 참조 타입 변수 englishScores가 참조하는 int 타입 배열 객체 인덱스 [0]번에
		// new 연산자로 길이가 2인 int 타입 배열 객체 생성 후 저장

		englishScores[1] = new int[3];
		// 참조 타입 변수 englishScores가 참조하는 int 타입 배열 객체 인덱스 [1]번에
		// new 연산자로 길이가 3인 int 타입 배열 객체 생성 후 저장

		for (int i = 0; i < englishScores.length; i++) { // 바깥 for문 시작
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 타입 변수 englishScores가 참조하는 int 타입 2차원 배열 객체 길이보다 작다
			// 증감식
			for (int k = 0; k < englishScores[i].length; k++) { // 중첩 for문 시작
				// 초기화식
				// 조건식 : int 타입 변수 i는 참조 타입 변수 englishScores가 참조하는 int 타입 2차원 배열 객체 인덱스[i] 길이보다
				// 작다
				// 증감식
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
				// 참조 타입 변수 englishScores가 참조하는 int 타입 2차원 배열 객체에 저장된 값 출력
			} // 중첩 for문 종료
		} // 바깥 for문 종료

		System.out.println();

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		// int 타입 2차원 배열을 참조하는 참조 타입 변수 javaScores에
		// 값 목록 방식으로 배열 객체 생성 후 저장
		// javaScores.length = 2
		// javaScores[0].length = 3
		// javaScores[1].length = 3

		for (int i = 0; i < javaScores.length; i++) { // 바깥 for문 시작
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 타입 변수 javaScores가 참조하는 int 타입 2차원 배열 객체 길이보다 작다
			// 증감식
			for (int k = 0; k < javaScores[i].length; k++) { // 중첩 for문 시작
				// 초기화식
				// 조건식 : int 타입 변수 k는 참조 타입 변수 javaScores가 참조하는 int 타입 2차원 배열 객체 길이 인덱스[i] 길이보다
				// 작다
				// 증감식
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
				// 참조 타입 변수 javaScores가 참조하는 int 타입 2차원 배열 객체에 저장된 값 출력
			} // 중첩 for문 종료
		} // 바깥 for문 종료
	}
}