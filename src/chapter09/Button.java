package chapter09;

public class Button {
	interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListner(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
}
