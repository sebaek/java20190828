package chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String origin = "다형성.png";
		String target = "Polymophism.png";
		
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(target);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사가 잘 되었습니다.");
	}
}










