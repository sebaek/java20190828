package chapter06;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	Car() { //기본 생성자 default constructor
		    //매개변수 없는 생성자 no-arg constructor.
		    //                      0-arg constructor
	}
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, int mo) {
//		this.model = model;
//		this.company = company;
	}
	
	Car(int a, String company) {
//		this.model = model;
//		this.company = company;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}





