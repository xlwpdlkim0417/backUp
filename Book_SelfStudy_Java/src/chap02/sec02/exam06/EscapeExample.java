package chap02.sec02.exam06;
//이스케이프 문자 출력

public class EscapeExample {

	public static void main(String[] args) {

		System.out.println("번호\t이름\t직업"); // 문자 리터럴 출력 ▷ \t 통해 문자 리터럴 사이 탭
		System.out.print("행 단위 출력\n"); // 문자 리터럴 출력 ▷ \n 통해 개행
		System.out.print("행 단위 출력\n"); // 문자 리터럴 출력 ▷ \n 통해 개행
		System.out.println("우리는 \"개발자\" 입니다."); // 문자 리터럴 출력 ▷ \"\" 통해 큰따옴표 표시
		System.out.println("봄\\여름\\가을\\겨울"); // 문자 리터럴 출력 ▷ \\ 통해 문자 리터럴 사이 역슬래시(\) 삽입
	}
}