package sec01.exam04;

public class NFE_Ex {

	public static void main(String[] args) {

		try {

			int x = Integer.parseInt("aa");
			System.out.println(x);

		} catch (NumberFormatException e) {
			
			System.out.println("숫자 변환 불가 = 예외 상황 발생 알려주는 프린트문 써주면 좋음");
			

			System.out.println(e.getMessage());

		}

	}

}
