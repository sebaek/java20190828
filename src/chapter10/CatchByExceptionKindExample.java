package chapter10;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException | java.lang.NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.println("값1 값2");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
