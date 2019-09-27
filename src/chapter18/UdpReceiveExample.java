package chapter18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(5001);
		
		int i = 0;
		while (i < 100) {
			DatagramPacket packet = new DatagramPacket(new byte[100], 100);
			socket.receive(packet);
			
			System.out.println("[받은내용]:" + new String(packet.getData(), 0, packet.getLength(), "UTF-8"));
			i++;
		}
		
		socket.close();
	}
}
