package chapter06.section10;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 45) + 1;
		System.out.println(num1);
		
		Random r = new Random();
		int num2 = r.nextInt(45) + 1;
		System.out.println(num2);
	}
}
