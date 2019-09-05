package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc = new RemoteControl() {

			@Override
			public void turnOff() {
			}

			@Override
			public void turnOn() {
			}

			@Override
			public void setVolume(int volume) {
			}
			
		};
		
		rc.setVolume(10);
	}
}







