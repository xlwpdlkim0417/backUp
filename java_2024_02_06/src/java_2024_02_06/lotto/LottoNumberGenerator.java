package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoNumberGenerator {

	public static void main(String[] args) {

		// 무작위로 선택된 로또 번호를 담을 HashSet 생성
		Set<Integer> lottoNumbers = new HashSet<>();

		// 중복되지 않는 6개의 로또 번호 선택
		Random rand = new Random();
		while (lottoNumbers.size() < 6) {
			int number = rand.nextInt(45) + 1; // 1부터 45까지의 숫자
			lottoNumbers.add(number);
		}

		// 선택된 로또 번호를 리스트로 변환하여 정렬
		List<Integer> sortedLottoNumbers = new ArrayList<>(lottoNumbers);
//		Collections.sort(sortedLottoNumbers);

		for (int num : sortedLottoNumbers) {
			System.out.println(num);
		}
		// 정렬된 로또 번호 출력
		System.out.println("선택된 로또 번호: " + sortedLottoNumbers);

	}

}
