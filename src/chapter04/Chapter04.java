package chapter04;

public class Chapter04 {
	public static void main(String[] args) {
		// if문
		
		//if (/*조건식*/) {
		//}
		
		if (true) {
			System.out.println("무조건 true");
		}
		
		if (false) {
			System.out.println("무조건 false");
		}
		
		int var1 = 3;
		
		if (var1 >= 3) {
			System.out.println("var1은 3보다 크거나 같다.");
		}
		
		
		var1 = 2;
		if (var1 >= 3) {
			System.out.println("var1은 3보다 크거나 같다.");
		} else {
			System.out.println("var1은 3보다 작다.");
		}
		
		
		if (var1 >= 3) {
			System.out.println("var1은 3보다 크거나 같다.");
		} else if (var1 >= 0 ){
			System.out.println("var1은 3보다 작고");
			System.out.println("0보다 크거나 같다.");
		} else if (var1 >= -3 ){
			System.out.println("var1은 0보다 작고");
			System.out.println("-3보다 크거나 같다.");
		} else {
			System.out.println("-3보다 작다.");
		}
		
		
		// switch case
		switch ("피자") {
		case "수박":
			System.out.println("수박을 먹다.");
			break;
		
		case "사과":
			System.out.println("사과를 먹다.");
//			break;
			
		case "딸기":
			System.out.println("딸기를 먹다.");
			break;

		default:
			System.out.println("아무것도 못먹다.");
			break;
		}
		
		
		// for 
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i:" + i + " j:" +j);
			}
		}
		
		char[] array = {'가', '나', '다'};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (char i : array) {
			System.out.println(i);
		}
		
		// while 
		
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		
		
		
		
		
		
		
		
	}
}
