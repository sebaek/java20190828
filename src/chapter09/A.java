package chapter09;

public class A {
	A() {
		System.out.println("a instance");
	}

	class B {
		B() {
			System.out.println("b instance");
		}

		int field1;

		void method1() {

		}
	}
	
	static class C {
		C() {
			System.out.println("c instance");
		}
		
		int field1;
		static int field2;
		void method1() {
		}
		
		static void method2() {
		}
	}
	
	void method() {
		class D {
			D() {
				System.out.println("d instance");
			}
			int field1;
			void method1() {
				
			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
