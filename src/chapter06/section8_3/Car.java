package chapter06.section8_3;

public class Car {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for (int i = 0; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h");
		}
	}
}
