package chap04.sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 2로 나눈 나머지가 0이 아닐 경우 = 즉, 홀수인 경우
				continue; // 반복문으로 다시 돌아감 그래서 홀수는 System.out.println(i); 출력까지 갈 일이 없음
			}
			System.out.println(i);
		}

	}

}
