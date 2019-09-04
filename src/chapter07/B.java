package chapter07;

public class B extends A {
	
	@Override //annotation
	int method1(String s) {
		super.method1(s);
		System.out.println("B 클래스 메소드");
		return 0;
	}
	
	void method2() {
		method3();
	}
	
}
