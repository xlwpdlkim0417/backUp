package Bank;

public class Bank {

	int idx;
	String name;
	String residentNumber;
	String phoneNumber;
	int balance;

	public Bank(int idx, String name, String residentNumber, String phoneNumber, int balance) {
//		super();
		this.idx = idx;
		this.name = name;
		this.residentNumber = residentNumber;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [idx=" + idx + ", name=" + name + ", residentNumber=" + residentNumber + ", phoneNumber="
				+ phoneNumber + ", balance=" + balance + "]";
	}

}
