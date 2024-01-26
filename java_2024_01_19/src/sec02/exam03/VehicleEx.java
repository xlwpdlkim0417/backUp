package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

interface Inter {

}

class MyClass {

}

class Acc {
	Inter inter;
	MyClass mc;
	int x;

	String method() {
		return "문자열";
	}

}

public class VehicleEx {

	public static void main(String[] args) {

		new Bus().checkFare(); // 이거 가능함 근데 1회용임 변수 설정해서 하는게 더 나음
		new Bus().checkFare();
		new Bus().checkFare();
		new Bus().checkFare(); // 이렇게 여러번 쓴다는건 호출될 때마다 새로 만들어서 출력하는거임 다 초기값만 나올걸

		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare();
		if(vehicle instanceof Bus) {
			System.out.println("가능");
		}
		Bus bus = (Bus) vehicle;
		bus.checkFare();

//
		String str = "테스트";
		String str1 = "";
		for (int i = 0; i < 100; i++) { // 성능 고민 필요?가 무슨말임?
			str1 += str;
		}
		System.out.println(str1);

		List<Acc> list = new ArrayList(); // 제네릭이 뭐냐하면 꺽쇄 들어가는거 있지? 그거 말하는거임
		// ArrayList<Account> list = new ArrayList<>(); 이거 제네릭임
		// 제네릭 안에 들어가는 타입이나 클래스 등을 제외한 건 들어갈 수가 없다는 제한상황임 꺽쇄 안에 String 들어가면 "문자열"만 살아남음
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
		list.add(new Acc());

		for (Object obj : list) {
			Acc acc = (Acc) obj;
			System.out.println(obj);
		}

	}

}
