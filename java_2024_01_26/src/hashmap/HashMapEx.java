package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("김하나", 85); // 키, 벨류
		map.put("이하나", 70);
		map.put("김하나", 90);
		// 이렇게 하고 "김하나" 찾으면 몇 점 나오겠음? 90 나오고 키 값이 중복되는 85 날아감
		// 벨류가 같은 값이어도 마찬가지임 그대로 하나는 날아간다고 보면 됨
		map.put("박하나", 95);
		System.out.println(map.get("이하나")); // 키 입력으로 벨류 찾아오기
		System.out.println(map.size());

	}

}
