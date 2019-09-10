package chapter11.exercise;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		
		int intData1 = Integer.valueOf(strData1);
		intData1 = Integer.parseInt(strData1);
		
		
		int intData2 = 150;
		
		String strData2 = String.valueOf(intData2);
		strData2 = Integer.toString(intData2);
		strData2 = intData2 + "";
	}
}





