package chapter18;

import java.io.FileInputStream;
import java.io.InputStream;

public class IOStream {
	public static void main(String[] args) throws Exception {
//		read1();
//		read2();
		read3();
	}
	
	public static void read3() throws Exception {
		InputStream fis = new FileInputStream("src/chapter18/IOStream.java");
		byte[] bytes = new byte[100];
		fis.read(bytes, 2, 3);
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		System.out.println(bytes[4]);
		System.out.println(bytes[5]);
		System.out.println(bytes[6]);
		
		fis.close();
	}
	
	public static void read2() throws Exception {
		InputStream fis = new FileInputStream("src/chapter18/IOStream.java");
		
		byte[] bytes = new byte[100];
		int read = fis.read(bytes);
		System.out.println(read);
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		System.out.println(fis.read(bytes));
		
		
		fis.close();
	}

	public static void read1() throws Exception {
		InputStream fis = new FileInputStream("src/chapter18/IOStream.java");

		int r = 0;

		while ((r = fis.read()) != -1) {
			System.out.print((char) r);
		}

		fis.close();
	}
}
