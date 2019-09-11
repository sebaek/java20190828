package test;

import java.math.BigDecimal;

public class StringFormatTest {
	public static void main(String[] args) {
		String s1 = "33";
		int i = 3333333;
		BigDecimal b = new BigDecimal("3333333333333333333333");
		b.setScale(0);
//		String format = s1.format("%02d", s1);
		String format1 = s1.format("%,d", i);
		String format2 = String.format("%,f", b);
		
//		System.out.println(format);
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(b);
	}
}
