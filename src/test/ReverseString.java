package test;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("입력된 텍스트 거꾸로 출력");
        while (true) {
            System.out.print("입력>");
            String str = scanner.nextLine();
            if (str.equals("종료")) {
            	break;
            } else {
            	System.out.print("출력>");
            	for (int i = str.length()-1; i >= 0 ; i--) {
            		System.out.print(str.charAt(i));
            	}
            	System.out.println();
            }
        }
        System.out.println("종료되었습니다.");

        scanner.close();
	}

}
