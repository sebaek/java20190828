package chapter07.section6.pkg2;

import chapter07.section6.pkg1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";
//		this.method();
	}
	
	@Override
	public void method() {
		System.out.println("디 메소드 실행");
	}
}
