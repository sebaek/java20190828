package chapter18;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		System.out.println("[연결 요청]");
		socket.connect(new InetSocketAddress("localhost", 5001));
		System.out.println("[연결 성공]");
		
		OutputStream os = socket.getOutputStream();
		os.write("Hello Server".getBytes("UTF-8"));
		os.flush();
		System.out.println("[데이터 보내기 성공]");
		
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[100];
		int readByteCount = is.read(bytes);
		String message = new String(bytes, 0, readByteCount, "UTF-8");
		System.out.println("[데이터 받기 성공:" + message);
		
		socket.close();
	}
}













