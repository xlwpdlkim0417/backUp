package java_2024_01_24.sec02.exam03;

public class Button {

	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {
		void onClick();
	}

}
