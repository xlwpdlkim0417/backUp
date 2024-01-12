package done;

//매개 변수의 개수를 모를 경우
public class Computer {

	int sum1(int[] values) { // 콜바이레퍼런스. 주소값을 매개변수로.

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
//		for (int val : values) {	//향상된 for문
//			sum += val;
//		}
		return sum;

	}

	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
