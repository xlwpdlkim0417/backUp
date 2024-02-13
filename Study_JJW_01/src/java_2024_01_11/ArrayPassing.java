package java_2024_01_11;

public class ArrayPassing {

	public static void increase(int[] arr) { // 괄호 안의 int배열은 참조 타입이라고 생각하십쇼

		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
//		increase(a);

		increase(new int[] { 1, 2, 3, 4 }); // 배열을 만들고 주소를 보내준거임 increase(a);랑은 다른 느낌

		for (int n : a) {

			System.out.println(n);

		}

	}

}
