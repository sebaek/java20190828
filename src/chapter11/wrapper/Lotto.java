package chapter11.wrapper;

import java.util.HashSet;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();
		int[] myLotto = {11, 13, 1, 21, 33, 44};
		long totalGame = 0;

		while (!isWon(set, myLotto)) {
			set.clear();
			while (set.size() < 6) {
//			System.out.println(random.nextInt(45) + 1);
				set.add(random.nextInt(45) + 1);
			}
			totalGame++;
		}
		
		System.out.println(totalGame + "주 후에 당첨");
		System.out.println((totalGame * 7 / 365) + "년 후에 당첨");

//		for (int num : set) {
//			System.out.println(num);
//		}
	}
	
	private static boolean isWon(HashSet<Integer> set, int[] my) {
		for (int num : my) {
			if (!set.contains(num)) {
				return false;
			}
		}
		return true;
	}
}










