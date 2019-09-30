package chapter18.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "src/chapter18/exercise/ClientExample.java";
		
		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] data = new byte[100];
		fileName.getBytes(0, fileName.length(), data, 0);
		os.write(data);
		
		
		System.out.println("파일 보내기 시작]" + fileName);
		FileInputStream fis = new FileInputStream(file);
		int bytes;
		while ((bytes = fis.read(data)) != -1) {
			os.write(data, 0, bytes);
		}
		
		os.flush();
		System.out.println("파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
