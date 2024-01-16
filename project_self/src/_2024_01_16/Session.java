package _2024_01_16;

public class Session {

	boolean run1;
	boolean run2;
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
		} else if (menu == MenuState.DEPOSIT_END) {
			run1 = true;
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

	public Session(boolean run1, boolean run2) {
		super();
		this.run1 = run1;
		this.run2 = run2;

	}

	@Override
	public String toString() {
		return "Session [run1=" + run1 + ", run2=" + run2 + ", menu=" + menu + "]";
	}

}
