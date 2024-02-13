package design.pattern;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.println("생산하려는 차종을 선택 (1:국산차, 2:미국차)");
		System.out.print("선택: ");
		String key = scan.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory();
			break;
		case "2":
			carFactory = new StateCarFactory();
			break;
		default:
			System.out.println("다시 선택하세요.");
			break;

		}

//		CarFactory carFactory = new KoreaCarFactory(); // 다형성을 위해 Carfactory 사용
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();

		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);

	}

}
//만약에 미국산 차 생산공장으로 바꾸려면?
// CarFactoy carFactory = new StateCarFactory로만 바꾸면 됨

//여기서 뽑아먹을만한 게 String key = scan.nextLine(); + case"1"