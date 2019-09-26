// 한글 입력...
package chapter18;

import java.io.FileReader;
import java.io.Reader;

public class ReaderWriter {
	public static void main(String[] args) throws Exception {
//		read1();
//		read2();
		read3();
	}
	
	public static void read3() throws Exception {
		Reader r = new FileReader("src/chapter18/ReaderWriter.java");
		char[] chars = new char[10];
		r.read(chars, 2, 5);
		
		System.out.println(chars[0]);
		System.out.println(chars[1]);
		System.out.println(chars[2]);
		System.out.println(chars[3]);
		System.out.println(chars[4]);
		System.out.println(chars[5]);
		System.out.println(chars[6]);
		System.out.println(chars[7]);
		System.out.println(chars[8]);
		System.out.println(chars[9]);
		
		
		
		
		r.close();
		
	}

	public static void read2() throws Exception {
		Reader r = new FileReader("src/chapter18/ReaderWriter.java");
		char[] chars = new char[2];
		r.read(chars);
		System.out.println(chars[0]);
		System.out.println(chars[1]);
		
		r.read(chars);
		System.out.println(chars[0]);
		System.out.println(chars[1]);
		
		r.close();
		
	}

	public static void read1(String[] args) throws Exception {
		Reader r = new FileReader("src/chapter18/ReaderWriter.java");

		int i = 0;
		
		while ((i = r.read()) != -1) {
			System.out.print((char) i);
		}
		
		r.close();
	}
}
