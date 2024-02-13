package java_2024_01_11;

public class Q_01_02_03_ArraySumAvgMax {

	public static void main(String[] args) {

		int[] a = { 1, 3, 10, 2, 8 };

		int sum = 0;
		double avg = 0;
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("합계 = " + sum);

		avg = sum / (double) a.length;
		System.out.println("평균 = " + avg);

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);

//		for (int i = 0; i < a.length; i++) {
//			for (int j = i; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					
//					System.out.println(a[i]);
//					System.out.println(a[j]);
//				}
//			}
//		}
	}
}

//0 vs 0 1 2 3 4 
//1 vs 1 2 3 4 
//2 vs 2 3 4 
//3 vs 3 4
