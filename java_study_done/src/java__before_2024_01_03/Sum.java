package __before_2024_01_03;

public class Sum {

	public static void main(String[] args) {
		//int x;
		int sum = 0;
		
		int start = 1;
		int end = 10;
		
		for (int i = start; i <= end; i++) {
			System.out.println("i: " + i);
			sum = sum +i; // sum = sum + i; 와 같음
			System.out.println("sum: " + sum);
		}
		//System.out.println("합계: " + sum);
		System.out.println(start + "부터 " + end + "까지의 합계: " + sum);
	}

}
