package _2024_01_09;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

//		cal.plus(100, 200);	//리턴값을 받지 않았기 때문에 아무것도 안나옴

		int num1 = cal.plus(100, 200);
		System.out.println(num1); // 리턴값 받았음 int num1으로

		double num2 = cal.plus(3.14, 0.59); // 바로 위의 메소드랑 같은 형식인데 값의 타입이 다르니까 그거에 맞춰서 실행한거 = 메소드 오버로딩
		System.out.println(num2);

	}

}
