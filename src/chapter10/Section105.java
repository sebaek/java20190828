package chapter10;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Section105 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
		try (
				FileInputStream fis = new FileInputStream("jean.txt");
				InputStreamReader is = new InputStreamReader(fis);				
			) {

//			fis = new FileInputStream("jean.txt");

		} catch (Exception e) {
			System.out.println(fis);
		} finally {

		}
	}
}
