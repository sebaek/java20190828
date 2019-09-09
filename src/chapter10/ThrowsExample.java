package chapter10;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		findClass2();
	}
	
	private static void findClass2() throws ClassNotFoundException {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
