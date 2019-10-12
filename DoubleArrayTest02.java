import java.util.Random;

public class DoubleArrayTest02 {

	public static void main(String[] args) {
		// TODO 행으로 더하기
		int[][] array = new int[3][4];
		
		Random ran = new Random();
		
		/*
		 * 2차 배열에 값 넣기
		 */
		
		// 재정의 
		array = new int[4][4];
		int sum = 0;
		
		for (int i =0; 1 < array.length; i++) {
			for (int j = 0; j < array[i].length ; j++) {
				array[i][j] = ran.nextInt(50) +1;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 ; j++) {
				sum += array [j][i]; //행의 합구하기
			}
			array[3][i] = sum;
			sum = 0;
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]); // 행배열 먼저 찍고
			}
			System.out.println(); // 옆에 행의 합 찍고 라인변경
		}
		
		

	}

}
