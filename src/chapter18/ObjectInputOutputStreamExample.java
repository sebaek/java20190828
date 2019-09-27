package chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class MyClass implements Serializable {
	
}

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new MyClass());
		oos.writeObject(new ArrayList<String>());
		oos.writeObject("홍길동");
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ois.readObject();
		ArrayList<String> list = (ArrayList<String>) ois.readObject();
		String str = (String) ois.readObject();
		
		list.add("김길동");
		System.out.println(str);
		
		ois.close();
		fis.close();
		
		
	}
}












