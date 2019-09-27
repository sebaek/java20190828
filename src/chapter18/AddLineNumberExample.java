package chapter18;

import java.io.File;
import java.util.Scanner;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chapter18/AddLineNumberExample.java";
		
		Scanner scanner = new Scanner(new File(filePath));
		
		int lineNum = 0;
		while (scanner.hasNextLine()) {
			lineNum++;
			System.out.printf("%3d:%s%n", lineNum, scanner.nextLine());
//			System.out.println(scanner.nextLine());
		}
			
		
		scanner.close();
		
		
//		FileReader fr = new FileReader(filePath);
//		BufferedReader br = new BufferedReader(fr);
//
//		String line;
//		int lineNum = 0;
//		while ((line = br.readLine()) != null) {
//			lineNum++;
//			System.out.print(lineNum + ":");
//			System.out.println(line);
//		}
//		br.close();
//		fr.close();
	}
}






