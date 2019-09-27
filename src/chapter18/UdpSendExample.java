package chapter18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();

		byte[] data = "메시지".getBytes("UTF-8");
		DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress("211.183.9.47", 5001));
		
		datagramSocket.send(packet);
		
		datagramSocket.close();
		
		System.out.println("전송완료");
	}
}




