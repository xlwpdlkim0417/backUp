package java_2024_01_16;

public class Session {

	boolean run1;
	boolean run2;
	boolean loginInfo;
	MenuState menu = MenuState.MENU_START;

	public boolean isRun1() {
		return run1;
	}

	public void setRun1(boolean run1) {
		this.run1 = run1;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}

	public MenuState getMenu() {
		return menu;
	}

	public void setMenu(MenuState menu) {
		if (menu == MenuState.DEPOSIT_START) {
			run1 = false;
			run2 = true;
		} else if (menu == MenuState.DEPOSIT_END) {
			run1 = true;
			run2 = false;
		} else if (menu == MenuState.LOGIN) {

		} else if (menu == MenuState.LOGOUT) {

		} else if (menu == MenuState.SIGNUP) {

		} else if (menu == MenuState.SIGNOUT) {

		} else if (menu == MenuState.MENU_START) {
			run1 = true;
		} else if (menu == MenuState.MENU_END) {
			run1 = false;
		}

		this.menu = menu;
	}

	public boolean isLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(boolean loginInfo) {
		this.loginInfo = loginInfo;
	}

	public Session(boolean run1, boolean run2, boolean loginInfo) {
		super();
		this.run1 = run1;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	@Override
	public String toString() {
		return "Session [run1=" + run1 + ", run2=" + run2 + ", loginInfo=" + loginInfo + ", menu=" + menu + "]";
	}

}
