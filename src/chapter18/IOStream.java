package chapter18;
// 한글 입력..
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {
	public static void main(String[] args) throws Exception {
		read1();
//		read2();
//		read3();
		
//		write1();
//		write2();
//		write3();
		
	}
	
	
	
	
	
	public static void write3() throws Exception {
		OutputStream os = new FileOutputStream("output.txt");
		byte[] b = "한글".getBytes();
		os.write(b, 2, 2);
		
		
		os.flush();
		os.close();
	}





	public static void write2() throws Exception {
		OutputStream os = new FileOutputStream("output.txt");
//		byte[] b = new byte[10];
		byte[] b = "korea".getBytes();
		os.write(b);
		
		os.flush();
		os.close();
		
	}





	public static void write1() throws Exception {
		OutputStream os = new FileOutputStream("output.txt");
		os.write(112);
		os.write('A');
		
		
		os.flush();
		os.close();
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
