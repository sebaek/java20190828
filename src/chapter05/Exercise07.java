package chapter05;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		// Integer
		// Short
		// Byte
		// Long
		
		// Double
		// Float
		
		// Character
		
		// Boolean
		
		int[] array = { -1, -5, -3, -8, -2, -10, -2, -3895, -892, -2, -3, -4, -2, -5, -2, -1, -54, -1, -65 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("max: " + max);
	}
}
