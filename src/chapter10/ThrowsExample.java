package chapter10;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		findClass2();
	}
	
	private static void findClass2() throws Exception {
		findClass();
	}

	public static void findClass() throws Exception {
		Class clazz = Class.forName("java.lang.String2");
	}
}
