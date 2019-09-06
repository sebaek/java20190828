package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindString {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("jean.txt"));
		String word = "a";
		int count = 0;

		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
			String line = "";
			int index = -1;

			line = scanner.nextLine().toLowerCase();

			while (true) {
				index = line.indexOf(word);
				if (index >= 0) {
					count++;
				} else {
					break;
				}
				line = line.substring(index + word.length());
			}
		}

		System.out.println(count + "개 있습니다.");

		scanner.close();
	}
}
