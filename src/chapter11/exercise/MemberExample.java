package chapter11.exercise;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member);
		System.out.println(member.toString());
		System.out.println(((Object) member).toString());
	}
}
