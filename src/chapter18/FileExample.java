package chapter18;

import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		File src = new File("src");
		if (src.exists()) {
			if (src.isDirectory()) {
				String[] files = src.list();
				for (String file : files) {
					System.out.println(file);
				}
			}
		}
	}
}
