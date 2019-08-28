package java20190828;

public class Chapter02 {
	public static void main(String[] args) {
		// 변수 선언
		// type name;

		// 변수명: $ _ 영문대소문자 숫자(맨앞불가)
		// lower카멜케이스로 작성 ex) firstName, homeAddress

		int name;
		name = 345;
		int name2 = 678;
		int name3 = 678 + 789;

		System.out.println(name);

		// 타입
		// 1. 기본데이터 타입
		// 총 8개
		// 숫자형 6개
		// 정수형 4개 byte(1), short(2), int(4), long(8)
		// 실수형 2개 float, double
		// 문자형 1개 char(2)
		// 논리형 1개 boolean
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

		// float: 4byte로 표현
		float floatVar;
		floatVar = 3.14F;
		System.out.println(floatVar);

		// double: 8byte로 표현
		double doubleVar;
		doubleVar = 3.14;
		System.out.println(doubleVar);

		// char: 2byte로 표현
		char charVar;
		char charVar2;
		char charVar3;
		char charVar4;
		char charVar5;
		charVar = '자';
		charVar2 = '바';
		charVar3 = 'J';
		charVar4 = 65;
		charVar5 = '\uac00';
		System.out.print(charVar);
		System.out.println(charVar2);
		System.out.println(charVar3);
		System.out.println(charVar4);
		System.out.println(charVar5);

		// boolean
		boolean booleanVar;
		booleanVar = true;
		booleanVar = false;
		System.out.println(booleanVar);

		// * 타입변환
		int intVar1 = 129;
		byte byteVar1;
		byteVar1 = (byte) intVar1; // 강제 형변환 (type conversion)
		System.out.println(byteVar1);

		int intVar2 = 125;
		byte byteVar2;
		byteVar2 = (byte) intVar2; // 강제 형변환 (type conversion)
		System.out.println(byteVar2);

		byte byteVar3 = 125;
		int intVar3 = byteVar3;
		System.out.println(intVar3);
		
		
		// *변수의 사용 범위 (scope)
		int intVar9;
//		System.out.println(intVar9);

		intVar9 = 30;
		if (intVar9 > 10) {
			int intVar10 = 5;
			
			if (intVar10 > 3) {
				System.out.println(intVar10);
			}
			
			intVar9 = 9;
		}
		System.out.println(intVar9);
//		System.out.println(intVar10);

	}
}






