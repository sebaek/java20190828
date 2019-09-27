package chapter18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("prim.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeDouble(3.5);
		dos.writeDouble(.5);
		dos.writeBoolean(false);
		dos.writeInt(33);
		
		dos.flush();
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("prim.dat"));
		double a = dis.readDouble();
		double b = dis.readDouble();
		boolean c = dis.readBoolean();
		int i = dis.readInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		
		dis.close();
		
	}
}












