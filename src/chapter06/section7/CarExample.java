package chapter06.section7;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("자가용");
		System.out.println(car2.model);
		System.out.println(car2.color);
		
		System.out.println(car2.maxSpeed);
		Car car3 = new Car("자가용", "빨강");
		
		Car car4 = new Car("택시", "검정", 200);
		
	}
}
