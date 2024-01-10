package sec04.exam04;

public class Calculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
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