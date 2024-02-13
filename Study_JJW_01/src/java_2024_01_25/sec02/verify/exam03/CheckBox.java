package java_2024_01_25.sec02.verify.exam03;

public class CheckBox {

	OnSelectListener listener;

	public void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect();
	}

}
