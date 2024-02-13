package chap05.sec02.exam09;
//System.arraycopy()로 배열 복사

public class ArrayCopyExample {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		// String 타입 배열을 참조하는 참조 변수 oldStrArray에
		// 배열 객체 생성 후 값 목록 저장
		String[] newStrArray = new String[5];
		// String 타입 배열 참조하는 참조 변수 newStrArray에
		// new 연산자로 길이가 5인 배열 객체 생성 후 저장

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 원본 배열 : oldStrArray
		// 원본 배열 시작 인덱스 : 0
		// 새 배열 : newStrArray
		// 새 배열 시작 인덱스 : 0
		// 복사할 개수 : oldStrArray.length ▷ 원본 배열 길이 ▷ 3

		for (int i = 0; i < newStrArray.length; i++) {
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 변수 newStrArray가 참조하는 배열 객체 길이보다 작다
			// 증감식
			System.out.print(newStrArray[i] + ",");
			// 참조 변수 newStrArray[i]에 저장된 값 출력
		}
	}
}
// 참조 타입 배열이 복사되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일