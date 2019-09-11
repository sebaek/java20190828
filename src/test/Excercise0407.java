package test;

import java.util.Scanner;

public class Excercise0407 {
	public static void main(String[] args) {
		
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.???? | 2.??? | 3.??? | 4.????");
			System.out.println("----------------------------------");
			System.out.print("????>");

			String select = scanner.nextLine();
			int cash;

			switch (select) {
			case "1":
				System.out.print("?????>");
				cash = Integer.parseInt(scanner.nextLine());
				balance += cash;
				break;
			case "2":
				System.out.print("????>");
				cash = Integer.parseInt(scanner.nextLine());
				balance -= cash;
				break;
			case "3":
				System.out.println("???>" + balance);
				break;
			case "4":
				run = false;
				break;

			default:
				break;
			}
		}

		System.out.println("???ес?? ????");
	}
}
