package java_Bank;

public class LoginInfor {

	String id;
	String pw;

	public LoginInfor(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "LoginInfor [id=" + id + ", pw=" + pw + "]";
	}

}
