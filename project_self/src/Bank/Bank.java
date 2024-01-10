package Bank;

public class Bank {

	int memberNum;
	String name;
	String residentNumber;
	String phoneNumber;
	int balance;

	public Bank(int memberNum, String name, String residentNumber, String phoneNumber, int balance) {
		super();
		this.memberNum = memberNum;
		this.name = name;
		this.residentNumber = residentNumber;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [memberNum=" + memberNum + ", name=" + name + ", residentNumber=" + residentNumber
				+ ", phoneNumber=" + phoneNumber + ", balance=" + balance + "]";
	}

}
