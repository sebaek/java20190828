package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindString {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("jean.txt"));
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
	}
}
