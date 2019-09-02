package chapter06.section8;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x , int y) {
		System.out.println("int int 실행");
		double result = (double) x / y;
		return result;
	}
	
	double divide(byte x , byte y) {
		System.out.println("byte byte 실행");
		double result = (double) x / y;
		return result;
	}
	
	
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
