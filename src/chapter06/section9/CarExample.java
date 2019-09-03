package chapter06.section9;

public class CarExample {
	public static void main(String[] args) {
		Car myCar;
		myCar = new Car("포르쉐");
		
		Car youCar;
		youCar = new Car("벤츠");
		
		myCar.run();
		youCar.run();
	}
}
