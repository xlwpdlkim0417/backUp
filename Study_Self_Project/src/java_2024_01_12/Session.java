package java_2024_01_12;

public class Session {

	private boolean run;
	private boolean run2;
	private LoginInfo loginInfo;
	MenuState menuState = MenuState.TOP;

	public LoginInfo getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

	public MenuState getMenuState() {
		return menuState;
	}

	public void setMenuState(MenuState menuState) {
		if (menuState == MenuState.DEPOSIT) {
			run2 = true;
		} else if (menuState == MenuState.TOP_EXIT) {
			run = false;
		} else if (menuState == MenuState.DEPOSI_EXIT) {
			run2 = false;
		}
		this.menuState = menuState;
	}

	public Session(boolean run, boolean run2, LoginInfo loginInfo) {
//		super();
		this.run = run;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	public Session(boolean run, boolean run2) { // 기존의 걸 수정하면 오류날 수 있으니 오버로딩이 이런 측면에서 또 좋네
//		super();
		this.run = run;
		this.run2 = run2;
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

	@Override
	public String toString() {
		return "Session [run=" + run + ", run2=" + run2 + "]";
	}

}
