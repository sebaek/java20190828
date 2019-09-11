package test;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        
        System.out.println("1~100 맞추기 게임");
        while (true) {
            System.out.print("입력>");
            int guess = scanner.nextInt();
            
            if (guess == number) {
                System.out.println("정답입니다.");
                break;
            } else if (guess > number) {
                System.out.println("더 낮은 수를 입력해보세요.");
            } else {
                System.out.println("더 높은 수를 입력해보세요.");
            }
        }

        scanner.close();
    }
}
