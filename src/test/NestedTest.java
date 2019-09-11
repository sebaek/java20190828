package test;

public class NestedTest {
	
	int k;
	
	class A {
		int i;
		
	}
	
	static class B {
		int i;
		static int j;
		void method() {
			int l = k;
		}
	}
	
	public static void main(String[] args) {
		class A {
			int i;
		}
		class B {}
		
		abstract class C {}
		
		A a = new A();
		NestedTest.B b = new NestedTest.B();
		NestedTest c = new NestedTest();
		NestedTest.A d = c.new A();
		
		C e = new C() {
			C() {}
		};
		
	}
	
	public void method() {
		class A {}
//		static class B {}
		
	}
}
