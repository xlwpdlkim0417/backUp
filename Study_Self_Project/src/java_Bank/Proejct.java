package java_Bank;

public class Proejct {

	public static void main(String[] args) {

		Account accountInfo = new Account(0, null, null, null, 0);
		LoginInfor loginInfo = new LoginInfor(null, null);
		Session session = new Session(true, false, false, false, loginInfo);
		Methods mth = new Methods();

		Account[] member = new Account[10];

		mth.menu1(session, accountInfo, member, loginInfo);

	}

}
