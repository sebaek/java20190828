package quiz;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("텍스트 입력>");
			String text = scanner.nextLine();
			if (text.equals("종료")) {
				break;
			}
			panlindrome(text);
		}
		System.out.println("종료 되었습니다.");
		scanner.close();
	}

	private static void panlindrome(String text) {
		text = text.toLowerCase();
		
		int left = 0;
		int right = text.length() - 1;
		
		while (left < right) {
			char leftChar = text.charAt(left);
			char rightChar = text.charAt(right);
			
			if (leftChar < 'a' || leftChar > 'z') {
				left++;
				continue;
			}
			
			if (rightChar < 'a' || rightChar > 'z') {
				right--;
				continue;
			}
			
			if (leftChar != rightChar) {
				System.out.println("NOT palindrome!!!!!");
				return;
			} else {
				left++;
				right--;
			}
		}
		System.out.println("palindrome");
	}
}








