package chapter06.section13.newpkg;

class Person2 {
	
}

public class Person {
	private int privateField = 0;
	int defaultField = 0;
	protected int protectedField = 0;
	public int publicField = 0;
	
	public Person() {
		privateField = 10;
		defaultField = 20;
	}
	
	void method() {
		privateField = 20;
		defaultField = 30;
	}
}
