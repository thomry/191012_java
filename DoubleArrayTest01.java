import java.util.Random;

public class DoubleArrayTest01 {

	public static void main(String[] args) {
		int[][] array = new int[3][4];
		
		Random ran = new Random();
		
		/*
		 * 2차 배열에 값 넣기
		 */
		
		for (int i =0; 1 < array.length; i++) {
			for (int j = 0; j < array[i].length ; j++) {
				array[i][j] = ran.nextInt(50) +1;
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {             // 각 열의 합 구해보기
			for (int j = 0; j < array[i].length ; j++) {
				sum += array[i][j]; // 행의 합 구하기
				System.out.print(array[i][j]+"\t"); // 행배열 먼저 찍고
			}
			
			System.out.println(sum); // 옆에 행의 합찍고 라인변경
			sum = 0; // 다음 더하기를 위해 초기화
		}

	}

}
