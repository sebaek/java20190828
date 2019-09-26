package chapter18;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
//		000000000000000000000000000000000000000000000
//		hi000000000000
		
		System.out.println("이름:");
		
		int nameBytes = is.read(datas);
		System.out.println(nameBytes);
		String name = new String(datas, 8, nameBytes - 2);
		
		System.out.println("입력한 이름: " + name);
		for (int i = 0; i < name.getBytes().length; i++) {
			System.out.print(name.getBytes()[i]);
		}
		System.out.println();
		System.out.println(name.length());
	}
}
