package test;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			throw new Exception("익셉션 발생쓰 뺌~");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
