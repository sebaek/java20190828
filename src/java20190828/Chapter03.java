package java20190828;

public class Chapter03 {
	public static void main(String[] args) {

		// . 단항연산자
		// .. 부호연산자
		// ... +, -
		
		int i = 3;
		int j = +3;
		int k = -3;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

		// .. 증감연산자
		// ... ++, --
		
		int intvalue1 = 5;
		intvalue1++;
		System.out.println(intvalue1);
		
		int intvalue2 = intvalue1++;
		System.out.println(intvalue2);
		System.out.println(intvalue1);
		
		int intvalue3 = ++intvalue1;
		System.out.println(intvalue3);
		System.out.println(intvalue1);
		

		// .. 논리 연산자
		// ... ! & |
		// ... !
		boolean bool1 = true;
		System.out.println(!bool1);
		System.out.println(bool1);

		// .. 비트 연산자
		// ... ~ & |
		
		// . 이항 연산자
		// .. 산술 연산자
		// ... + - * / %
		
		int intvalue4 = 15;
		int intvalue5 = 0;
		int intvalue6 = intvalue4 + intvalue5;
		System.out.println(intvalue6);
		
		int intvalue7 = intvalue4 - intvalue5;
		System.out.println(intvalue7);
		
		int intvalue8 = intvalue4 * intvalue5;
		System.out.println(intvalue8);
		
		if (intvalue5 != 0) {
			
			// 0으로 나누는 것은 런타임에러.
			int intvalue9 = intvalue4 / intvalue5;
			System.out.println(intvalue9);
			
		}
		
		short s = 3;
		short t = 4;
//		short u = s + t; //int로 변환 후에 계산됨.
		
		double doublevar1 = 0.1;
		double doublevar2 = 0.2;
		double doublevar3 = (doublevar1 * 10 + doublevar2 * 10) / 10;
		System.out.println(doublevar3);
		
		double doublevar4 = 3.0;
		double doublevar5 = 0.0;
		
		double doublevar6 = doublevar4 / doublevar5;
		System.out.println(doublevar6);
		double doublevar7 = doublevar6 - 999999999999l;
		System.out.println(doublevar7);
		
		
		// .. 문자열
		// ... +
		String str1 = "이것이";
		String str2 = "자바다";
		String str3 = str1 + str2;
		
		
		
		
		
		
	}
}




























