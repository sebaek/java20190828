package chapter18;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		System.out.print("입력:");
		int inputChar =  is.read();
		
		System.out.println(inputChar);
		System.out.println(is.read());
		System.out.println(is.read());
	}
}
