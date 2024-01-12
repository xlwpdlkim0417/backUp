package _Bank;

public class Session {

	private boolean run;
	private boolean run2;
	private boolean login;
	private boolean signin;
	private LoginInfor loginInfo;
	private MenuState menuState = MenuState.MAIN;

	public Session(boolean run, boolean run2, boolean login, boolean signin, LoginInfor loginInfo) {
		super();
		this.run = run;
		this.run2 = run2;
		this.login = login;
		this.signin = signin;
		this.loginInfo = loginInfo;

	}

	@Override
	public String toString() {
		return "Session [run=" + run + ", run2=" + run2 + ", login=" + login + ", signin=" + signin + ", loginInfo="
				+ loginInfo + "]";
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}

	public LoginInfor getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfor loginInfo) {
		this.loginInfo = loginInfo;
	}

	public MenuState getMenuState() {
		return menuState;
	}
	
	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public boolean isSignin() {
		return signin;
	}

	public void setSignin(boolean signin) {
		this.signin = signin;
	}

	public void setMenuState(MenuState menuState) {

		if (menuState == MenuState.DEPOSIT) {
			run2 = true;
		} else if (menuState == MenuState.MAIN_EXIT) {
			run = false;
		} else if (menuState == MenuState.DEPOSIT_EXIT) {
			run2 = false;
		} else if (menuState == MenuState.LOGIN) {
			login = true;
		} else if (menuState == MenuState.LOGOUT) {
			login = false;
		} else if (menuState == MenuState.SIGNIN) {
			signin = true;
		} else if (menuState == MenuState.SIGNOUT) {
			signin = false;
		}

		this.menuState = menuState;
	}

	

	
	

}
