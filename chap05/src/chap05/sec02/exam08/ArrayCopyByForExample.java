package sec02.exam08;
//for문으로 배열 복사

public class ArrayCopyByForExample {

	public static void main(String[] args) {

		int[] oldIntArray = { 1, 2, 3 };
		// int 타입 배열을 참조하는 참조 변수 oldIntArray에
		// int 타입 배열 객체 생성 후 값 목록 저장

		int[] newIntArray = new int[5];
		// int 타입 배열을 참조하는 참조 변수 newIntArray에
		// new 연산자로 길이가 5인 int 타입 배열 객체 생성 후 저장

		for (int i = 0; i < oldIntArray.length; i++) {
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 변수 oldIntArray가 참조하는 int 타입 배열 객체 길이보다 작다 ▷ 3
			// 증감식
			newIntArray[i] = oldIntArray[i];
			// 참조 변수 newIntArray[i]와 참조 변수 oldIntArray[i]의 인덱스 값 비교
		}

		for (int i = 0; i < newIntArray.length; i++) {
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 변수 newIntArray가 참조하는 int 타입 배열 객체 길이보다 작다
			// 증감식
			System.out.print(newIntArray[i] + ",");
			// 참조 변수 newIntArray[i]에 저장된 값 출력
		}
	}
}
// int[] newIntArray = new int[5];
// newIntArray : 배열을 참조하기 위한 변수
// newIntArray[i] : 배열 내의 특정 원소를 참조하기 위한 변수