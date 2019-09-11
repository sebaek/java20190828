package test;

import java.util.HashSet;

public class TestEx {
	public static void main(String[] args) {
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
	}
}
