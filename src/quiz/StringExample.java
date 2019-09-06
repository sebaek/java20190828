package quiz;

public class StringExample {
	public static void main(String[] args) {
		String str = "   자바 프로그래밍 프로    ";
		int i = 9999;
		String s = String.valueOf(i);
		s = i + "";
		System.out.println(s);
		
		char c0 = str.charAt(0);
		char c1 = str.charAt(1);
		System.out.println(str);
		System.out.println(str.trim());
		
		String str3 = str.substring(3, 8);
		System.out.println(str3);
		
		String str2 = str.replace("프로", "pro");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str2.toUpperCase());
		
//		int i = str.indexOf("프로");
		int j = str.lastIndexOf("프로");
		System.out.println(i);
		System.out.println(j);
		System.out.println(str.length());
		
		System.out.println(c0);
		System.out.println(c1);
	}
}
