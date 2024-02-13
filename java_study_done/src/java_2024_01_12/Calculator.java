package _2024_01_12;

public class Calculator {

	private int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // 내부 호출. 변수 앞에 this+도트연산자 누르면 내부 요소들을 볼 수 있음 (내부 요소라고 해봐야 필드랑 메소드이긴함)
		double result = sum / 2;
		return result;
	}

	void execute() { // 외부 호출
		double result = avg(7, 10); // 내부 호출. 중복성을 줄이고 효율성 증대.
		println("실행결과: " + result); // 네부 호출
	}

	void println(String message) {
		System.out.println(message);
	}

}
// 16라인에서 호출이 제일 먼저 일어나서 avg() 메소드가 실행
// avg() 메소드의 10라인에서 호출이 일어나서 plus() 메소드 실행
// plus() 메소드가 리턴값을 주면 avg() 메소드는 10라인에서 리턴값을 sum 변수에 저장하고 11라인을 실행한 후 12라인에서 execute() 메소드로 리턴값을 전달
// execute() 메소드는 16라인에서 avg() 메소드의 리턴값을 받아 17라인에서 pirntln() 메소드를 호출할 때 매개값으로 전달
// println() 메소드는 매개값으로 받은 문자열을 21라인에서 콘솔로 출력
// 마지막으로 execute() 메소드는 18라인을 만나게 되고 종료