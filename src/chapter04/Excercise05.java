package chapter04;

public class Excercise05 {
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		for (int x = 1; x <= 10; x++) {
			double y = (60 - 4 * x) / 5.0;
			if (y % 1 == 0) {
				System.out.println(x + ", " + (int) y );
			}
		}
	}
}
