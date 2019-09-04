package chapter07;

public class CarUser {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setTire(new Tire());
		car.setTire(new KumhoTire());
		car.setTire(new HankookTire());
		
		car.stop();
	}
}
