package chapter06.section10;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
//		System.out.println(Calculator.a);
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		Calculator c = new Calculator();
		System.out.println(c.pi);
		System.out.println(c.plus(5, 5));
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
