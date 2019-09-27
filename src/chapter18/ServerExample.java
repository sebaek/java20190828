package chapter18;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 8080));
		System.out.println("[연결 기다림]");
		Socket socket = serverSocket.accept();
		InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
		System.out.println("[연결 수락함]" + isa.getHostName());
		
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[100];
		int readByteCount = is.read(bytes);
		String message = new String(bytes, 0, readByteCount, "UTF-8");
		System.out.println("[데이터 받기 성공]:" + message);
		
		OutputStream os = socket.getOutputStream();
		message = "Hello Client";
		bytes = message.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		System.out.println("[데이터 보내기 성공]");
		
		is.close();
		os.close();
		socket.close();
		serverSocket.close();
		
	}
	
}




