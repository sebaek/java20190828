package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
//		rc = new Audio();
		
		RemoteControl.changeBattery();
		System.out.println(RemoteControl.MAX_VOLUME);
		rc.setMute(false);
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		
		Searchable st = new SmartTelevision();
		SmartTelevision st2 = (SmartTelevision) st;
		RemoteControl rc2 = (RemoteControl) st;
		
//		Searchable st3 = (Searchable) rc; 
		
		
		
//		st.turnOn();
//		st.turnOff();
//		st.setVolume(5);
//		st.search("");
		
		
		
		
		
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







