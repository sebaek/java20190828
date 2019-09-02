package chapter05;

public class Exercise06 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},				//int[]
				{83, 92, 96},			//int[]
				{78, 83, 93, 87, 88}	//int[]
		};
		
		int[][] array2 = array;
		array2[2][2] = 999;
		System.out.println(array[2][2]);
		
		System.out.println(array.length);
		System.out.println(array[2].length);
	}
}
