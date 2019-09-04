package chapter07.casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
//		parent.method3();
		
		parent = new Parent();
		
		System.out.println(parent instanceof Child);
		System.out.println(parent instanceof Parent);
		System.out.println(parent instanceof Child2);
		
		if (parent instanceof Child2) {
			Child2 child2 = (Child2) parent;
		}
		if (parent instanceof Child) {
			Child child = (Child) parent;
			child.field2 = "yyy";
			child.method3();
		}
	}
}
