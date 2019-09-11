package chapter09.section952;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트티비를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트티비를 끕니다.");
			}
		});
	}
}
