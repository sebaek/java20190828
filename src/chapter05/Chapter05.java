package chapter05;

public class Chapter05 {
	public static void main(String[] args) {
		// 참조 타입 (reference type)
		// 그림 참조...
		
		
		// null, NullPointerException
		String str = null;
		if (str != null) {
			System.out.println(str.toString());
		}
		
		
		// 배열.
		int i;
		i = 1;
		int j = 3;
		
		int[] array1;
		array1 = new int[] {5, 6, 7};
		int[] array2 = {6, 7, 8};
		int[] array3 = new int[3];
		array3[0] = 3;
		array3[1] = 6;
		array3[2] = 7;
		array3[2] = 9;
		
		int[] array4 = new int[4];
		
		for (int k = 0; k < array3.length; k++) {
			array4[k] = array3[k];
		}
		array4[3] = 9;
//		array4[4] = 10;
		
		
		System.out.println(array1[1] == array2[0]);
		System.out.println(array1 == array2);
		
		String[] strArray1 = {"a", "b", "c"};
		String[] strArray2 = {new String("b"), "c", "d"};
		System.out.println(strArray1[1] == strArray2[0]);
		System.out.println(strArray1[1].equals(strArray2[0]));
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
