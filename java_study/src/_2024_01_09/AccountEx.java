package _2024_01_09;

public class AccountEx {

	public static void main(String[] args) {

		Account acc = new Account();

		acc.name = "김하나";
		acc.ssn = "911224";
		acc.tel = "010-1234-1234";
		System.out.println(acc);
		System.out.println(acc.name);

		Account acc1 = new Account("강하나", "980204", "010-1234-1234", 26);

		System.out.println(acc1);	//위치 주의할 것

	}

}
