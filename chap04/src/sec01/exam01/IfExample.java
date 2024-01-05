package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다."); //여기 출력되는 이유는 조건문 옆에 괄호가 없기 때문임 조건문에 의해서 바로 다음 줄인 "점수가 90보다 작습니다."가 false기 때문에 출력되지 않았지만 그 다음 라인은 다름 조건문에 걸리는게 아니라 그냥 출력됨

	}

}
