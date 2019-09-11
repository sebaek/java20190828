package chapter09;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new CallListener());
		btn.touch();
		
		btn.setOnClickListner(new MessageListener());
		btn.touch();
		
		btn.setOnClickListner(new Button.OnClickListener() {
			public void onClick() {
				System.out.println("종료합니다.");
			}
		});
		btn.touch();
	}
}


