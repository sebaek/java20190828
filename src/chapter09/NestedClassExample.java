package chapter09;

public class NestedClassExample {
	public static void main(String[] args) {
		NestedClass o = new NestedClass();
		NestedClass.A a = o.new A();
		
		NestedClass.B b = new NestedClass.B();
		
		System.out.println(NestedClass.j);
		
		a.methodA();
		
		
	}
}
