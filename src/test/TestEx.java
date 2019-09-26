package test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;

public class TestEx {
	public static void main(String[] args) throws Exception {
		String str = "한글";
		Test t = new Test();
		Number s = 3;
		System.out.println(t.getClass());
		System.out.println(s.getClass());
		System.out.println(t.hashCode());
		t.setName("hong");
		System.out.println(t.hashCode());
		
		HashSet<Test> set = new HashSet<>();
		t.setI(1);
		set.add(t);
		System.out.println(set);
		Test t2 = new Test();
		t2.setI(1);
		t2.setName("hong");
		set.add(t2);
		System.out.println(set);
		
		System.out.println();
		int i = 0;
		System.out.println(i = 1);
		
		InputStream is = new FileInputStream("./src/test/TestEx.java");
		Reader reader = new InputStreamReader(is);
		
		int ch = 0;
		while ((ch = reader.read()) != -1) {
			System.out.print((char) ch);
		}
		
		
		is.close();
		
	}
}






