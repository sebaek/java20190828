package chapter05;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},				//int[]
				{83, 92, 96},			//int[]
				{78, 83, 93, 87, 88}	//int[]
		};
		int sum = 0;
		double avg = 0.0;
		
		int number = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
//				number++;
			}
			number += array[i].length;
		}
		
		avg = (double) sum / number;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
