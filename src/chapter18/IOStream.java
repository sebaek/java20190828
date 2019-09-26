package chapter18;

import java.io.FileInputStream;
import java.io.InputStream;

public class IOStream {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("src/chapter18/IOStream.java");
		
		
		fis.close();
	}
}
