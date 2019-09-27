package chapter18;

import java.net.InetAddress;

public class InerAddressExample {
	public static void main(String[] args) throws Exception {
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress remote : iaArr) {
			System.out.println(remote.getHostAddress());
		}
	}
}
