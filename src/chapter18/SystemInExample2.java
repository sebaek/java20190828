package chapter18;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.println("이름:");
		
		int nameBytes = is.read(datas);
		System.out.println(nameBytes);
		String name = new String(datas, 0, nameBytes-2);
		
		System.out.println("입력한 이름: " + name);
	}
}
