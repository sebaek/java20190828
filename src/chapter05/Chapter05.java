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
		
		//다차원 배열 
		int[] array5 = {33, 44, 55};
		int[][] array6;
		array6 = new int[][] { 
					new int[] {44, 55},
					new int[] {99, 88, 77},
					new int[] {23, 45, 67, 99}
		};
		
		int[] array7 = array6[0];
		for (int l = 0; l < 2; l++ ) {
			System.out.println(array7[l]);
		}
		int[] array8 = array6[1];
		for (int l = 0; l < 3; l++ ) {
			System.out.println(array8[l]);
		}
		int[] array9 = array6[2];
		for (int l = 0; l < 4; l++ ) {
			System.out.println(array9[l]);
		}
		
		System.out.println("=============================");
		for (int l = 0; l < array6.length; l++) {
			for (int m = 0; m < array6[l].length; m++) {
				System.out.println(array6[l][m]);
			}
		}
		array6[2][3] = 103;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
