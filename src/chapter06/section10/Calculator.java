package chapter06.section10;

public class Calculator {
	int a = 3;
	static double pi = 3.14159;
	
	int plus2(int x, int y) {
		return x + y + a;
	}
	
	static int plus(int x, int y) {
		Calculator c = new Calculator();
		return c.plus2(x, y);
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
