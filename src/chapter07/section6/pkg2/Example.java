package chapter07.section6.pkg2;

import chapter07.section6.pkg1.A;

public class Example {
	public static void main(String[] args) {
		D d = new D();
		A a = new D();
		
		d.method();
		a.method();
		
		A b = d;
		b.method();
		
		System.out.println(b == d);
		
	}
}
