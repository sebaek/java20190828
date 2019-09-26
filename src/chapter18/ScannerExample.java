package chapter18;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		System.out.println(str);
		
		int i = scanner.nextInt();
		System.out.println(i);
		
		double d = scanner.nextDouble();
		System.out.println(d);
		
		scanner.close();
	}
}
