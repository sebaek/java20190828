package chapter11.wrapper;

import java.util.HashSet;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int[] myLotto = new int[6];
		myLotto[0] = 3;
		myLotto[1] = 6;
		myLotto[2] = 14;
		myLotto[3] = 8;
		myLotto[4] = 21;
		myLotto[5] = 33;

		long totalGame = 0;
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();

		while (!isWon(myLotto, set)) {
			set.clear();
			while (set.size() < 6) {
				set.add(random.nextInt(45) + 1); 
			}
			totalGame++;
		}
		
		System.out.println(totalGame + "주 후에 당첨");
		System.out.println((totalGame * 7 / 365) + "년 후에 당첨");
	}

	private static boolean isWon(int[] myLotto, HashSet<Integer> set) {
		for (int num : myLotto) {
			if (!set.contains(num)) {
				return false;
			}
		}
		return true;
	}
}




