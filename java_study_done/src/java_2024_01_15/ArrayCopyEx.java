package _2024_01_15;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String[] arr = { "김사랑", "김하나", "김두울", "김세엣" };
//		String[] arr2 = arr;	// 이건 복사가 아니고 그저 번지수를 공유하는 변수 하나가 추가될 뿐임	

		String[] newArr = new String[arr.length];

		for (String str : newArr) {
			System.out.println(str);
		}
		// 우리책 p195 배열 복사
		System.arraycopy(arr, 0, newArr, 0, newArr.length); // 장점은 원하느 부분을 떼어내서 복사할 수 있다는 것 단점은 객체를 생성해주어야 한다는 점 마지막
															// newArr.length는 arr.length여도 됨 지금은 둘이 값이 같으니까

		for (String str : newArr) {
			System.out.println(str);
		}
		// 더 좋아진 배열 복사

		String[] newArr1 = Arrays.copyOf(arr, arr.length);

		for (String str : newArr1) {
			System.out.println(str);
		}
	}

}
