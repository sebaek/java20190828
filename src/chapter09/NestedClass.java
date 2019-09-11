package chapter09;

public class NestedClass {
	interface NestedInterface {
		void method();
	}
	class A {
		void methodA() {
			
		}
	}
	
	static class B {
		
	}
	void method(int k) {
		int i = 0;
		class C {
			int j = i;
			int l = k;
		}
//		k = 3;
//		i = 1;
		C c = new C();
		
	}
	
	
	
	static int j;
	int i;
	public NestedClass() {
		// TODO Auto-generated constructor stub
	}
	
	
}
