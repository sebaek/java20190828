package quiz;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("거꾸로 출력할 텍스트 입력하세요");
		
		while (true) {
			System.out.print("입력>");
			String text = scanner.nextLine();
			
			if (text.equals("종료")) {
				break;
			}
			
			System.out.print("출력>");
			
			for (int i = text.length()-1; i >= 0; i--) {
				System.out.print(text.charAt(i));
			}
			System.out.println();
		}
		System.out.println("종료되었습니다.");
		
		scanner.close();
	}
}
