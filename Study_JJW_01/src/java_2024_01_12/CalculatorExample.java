package java_2024_01_12;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();

		myCalc.execute(); // Calculator의 excute() 메소드 호출

//		myCalc.plus(0, 0);		//외부호출 근데 만약에 plus에 private를 붙이면?

//		Calculator myCalc1 = new Calculator();	//이렇게 여러 객체를 만들었을 때 각 변수가 담고 있는 요소를 파악하기 위해서 this. 이 필요한 거임
//		
//		Calculator myCalc2 = new Calculator();

	}

}
