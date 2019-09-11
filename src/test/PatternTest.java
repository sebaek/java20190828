package test;

import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] args) {
		String regex = "034|456";
		String input = "034";
		boolean match = Pattern.matches(regex, input);
		System.out.println(match);
	}
}
