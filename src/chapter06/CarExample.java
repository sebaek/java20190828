package chapter06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car();
		
//		Car myCar3 = new Car("레드", 3000);
		Car myCar4 = new Car("그랜져");
		Car myCar5 = new Car("아반떼", "블루");
		System.out.println(myCar4.model);
		System.out.println(myCar5.model);
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println("myCar2의 속도: " + myCar2.speed);
	}
}





