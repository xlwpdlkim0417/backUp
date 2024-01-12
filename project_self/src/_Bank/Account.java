package _Bank;

public class Account {

	int idx;
	String name;
	String residentNum;
	String phoneNum;
	int balance;

	public Account(int idx, String name, String residentNum, String phoneNum, int balance) {
		super();
		this.idx = idx;
		this.name = name;
		this.residentNum = residentNum;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [idx=" + idx + ", name=" + name + ", residentNum=" + residentNum + ", phoneNum=" + phoneNum
				+ ", balance=" + balance + "]";
	}

}
