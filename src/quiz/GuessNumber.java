package quiz;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int randomNum = (int) (Math.random() * 100) + 1;
//		System.out.println(randomNum);
		Scanner scanner = new Scanner(System.in);

		System.out.println("1~100의 수를 맞춰주세요.");
		boolean run = true;
		while (run) {
			System.out.print("입력>");
			int userNum = scanner.nextInt();
			if (userNum == randomNum) {
				System.out.println("정답입니다.");
				run = false;
			} else if (userNum > randomNum) {
				System.out.println("더 작은 수를 입력해주세요.");
			} else {
				System.out.println("더 큰 수를 입력해주세요.");
			}
		}

		scanner.close();

	}
}
