package chapter11.wrapper;

import java.util.HashSet;

import chapter11.exercise.Student;

public class WrapperTest {
	public static void main(String[] args) {
		int i = 3;
		Integer k = 3;
		Double c = 3.14;
		k = i;  // auto boxing
		i = k;  // auto unboxing
		Integer j = new Integer(3);
		Double b = new Double(3.14);
		String s = "링링";
		
		HashSet set = new HashSet();
		set.add(new Student("3"));
		System.out.println(set.size());
		set.add(new Student("4"));
		System.out.println(set.size());
		set.add(new Student("4"));
		System.out.println(set.size());
		
		
		set.add(Integer.valueOf(i));
		
		HashSet<Integer> set2 = new HashSet<Integer>();
//		HashSet<int> set3 = new HashSet<int>();
//		set2.add(new Student("5"));
		set2.add(Integer.valueOf(3));
		set2.add(3);
		System.out.println(set2.size());
		System.out.println();
		int sum = 0;
		for (Integer l : set2) {
			sum += l;
//			System.out.println(l);
		}
		System.out.println(sum);
		
		Integer i1 = 6789;
		Integer i2 = 6789;
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}










