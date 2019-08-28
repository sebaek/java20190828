package java20190828;

public class Chapter02 {
	public static void main(String[] args) {
		//변수 선언
		// type name;
		
		// 변수명: $ _ 영문대소문자 숫자(맨앞불가)
		// lower카멜케이스로 작성 ex) firstName, homeAddress
		
		int name;
		name = 345;
		System.out.println(name);
		
		
		
		// 타입 
		// 1. 기본데이터 타입
		//    총 8개
		//    숫자형 6개
		//      정수형 4개 byte(1), short(2), int(4), long(8)
		//      실수형 2개 float, double
		//    문자형 1개 char
		//    논리형 1개 boolean
		//
		// 2. 참조형데이터 타입
		
		
		// byte: 1byte로 값을 표현
		// -128 ~ 127
		
		byte byteVar;
		byteVar = 120;
//		byteVar = 250;
		System.out.println(byteVar);
		
		// short: 2byte로 표현
		// -32768 ~ 32767
		short shortVar;
		shortVar = 32767;
		System.out.println(shortVar);
		
		// int: 4byte로 표현
		// -2147483648 ~ 2147483647
		int intVar;
		intVar = 2147483647;
		System.out.println(intVar);
		
		// long: 8byte로 표현
		// -9223372036854775808 ~ 9223372036854775807
		long longVar;
		longVar = 9223372036854775807L;
		System.out.println(longVar);
		
		
		
		
		
		
		
		
	}
}
