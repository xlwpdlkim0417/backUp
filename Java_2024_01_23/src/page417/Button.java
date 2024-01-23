package page417;

public class Button {

	OnClickListener listener;

	void setOnClickLitener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {

		void onClick();
	}

}
