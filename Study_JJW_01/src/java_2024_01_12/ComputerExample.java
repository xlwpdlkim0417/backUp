package java_2024_01_12;

//매개 변수의 개수를 모를 경우
public class ComputerExample {

	public static void main(String[] args) {

		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2: " + result2);

		int result3 = myCom.sum2(1, 2, 3); // 이거 뭐지? 왜 손코딩할 때 의문을 갖지 않았을까?
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);

	}

}
