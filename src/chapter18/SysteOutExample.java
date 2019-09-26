package chapter18;

import java.io.OutputStream;

public class SysteOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		os.write(112);
		
		String hangul = "가나다";
		byte[] bytes = hangul.getBytes();
		os.write(bytes);
		
		os.flush();
	}
}
