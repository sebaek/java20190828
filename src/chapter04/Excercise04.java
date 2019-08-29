package chapter04;

public class Excercise04 {
	public static void main(String[] args) {
		int d1 = 0;
		int d2 = 0;

		while (d1 + d2 != 5) {
			d1 = (int) (Math.random() * 6) + 1;
			d2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + d1 + ", " + d2 + ")");
		}

	}
}
