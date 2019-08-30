package chapter05;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int[] scores2 = new int[] {83, 90, 87};
		int a = 3;
		int sum2 = add(scores2, a);
		System.out.println("총합 : " + sum1);
		System.out.println();
		System.out.println(scores2[0]);
		System.out.println(a);
	}

	private static int add(int[] scores, int b) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		scores[0] = 555;
		b = 5;
		return sum;
	}
}
