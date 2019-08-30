package chapter04;

import java.util.Scanner;

public class Excersice07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");

			String select = scanner.nextLine();
			String cash = "";

			switch (select) {
			case "1":
				System.out.print("예금액>");
				cash = scanner.nextLine();
				balance = balance + Integer.parseInt(cash);
				break;
			case "2":
				System.out.print("출금액>");
				cash = scanner.nextLine();
				balance = balance - Integer.parseInt(cash);
				break;
			case "3":
				System.out.println("잔고>" + balance);
				break;
			case "4":
				run = false;
				break;

			default:
				break;
			}
		}

		System.out.println("프로그램 종료");
	}
}
