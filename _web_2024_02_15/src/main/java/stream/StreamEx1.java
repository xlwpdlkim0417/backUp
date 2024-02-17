package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// 위나 아래 중에서 하나 골라서 써야되는데 위가 좀 나을듯?

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		// 2, 4
		
		list.stream().map(i -> i*2).forEach(i -> System.out.println(i));
		
		list.stream().map(i -> "요소는" + i + "입니다.").forEach(i -> System.out.println(i));
		
		list.stream().map(i -> "요소는" + i + "입니다.").limit(3).forEach(i -> System.out.println(i));
		
		list.stream().map(i -> "요소는" + i + "입니다.").limit(3).forEach(System.out::println);
		// :: 이건 Static method 에서만 쓸 수 있다고 알고 있으면 될듯
		
		
		long count = list.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);
		// 2

		for (Integer i : list2) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 2, 4
	}
}