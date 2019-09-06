package quiz;

public class PrimeNumber {
	public static void main(String[] args) {
		long num = 2;
		int count = 0;
		while (count < 1000) {
			if (isPrimeNumber(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	public static boolean isPrimeNumber(long num) {
		for (long i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
