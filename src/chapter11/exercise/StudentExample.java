package chapter11.exercise;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		HashMap<Student, String> hashmap = new HashMap<Student, String>();
		Student s1 = new Student("1");
		Student s2 = new Student("1");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		hashmap.put(s1, "95");
		
		String score = hashmap.get(s2);
		System.out.println(score);
		
	}
}
