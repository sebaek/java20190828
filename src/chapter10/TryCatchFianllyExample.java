package chapter10;

public class TryCatchFianllyExample {
	public static void main(String[] args) {
		try {
			System.out.println("try 블럭 시작");
			Class<?> clazz = Class.forName("chapter10.NumberFormatException");
			System.out.println("try 블럭 종료");
			return;
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("무조건 실행되는 블럭");
		}
		System.out.println("메인 메소드 나머지 코드");
		
	}
}
