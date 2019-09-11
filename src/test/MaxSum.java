package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class MaxSum {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "numbers.txt";
		File out = new File(fileName);
		long fileMaxSize = 1024*1024*1024;
		PrintWriter pw = new PrintWriter(out);
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
//		while (true) {
			int num = random.nextInt();
//			System.out.println(num);
			pw.write(num + "\n");
//			pw.flush();
//			if (out.length() > fileMaxSize) {
//				break;
//			}
		}
		
		pw.close();
//		System.out.println(out.length());
		
	}
}
