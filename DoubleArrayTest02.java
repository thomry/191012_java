import java.util.Random;

public class DoubleArrayTest02 {

	public static void main(String[] args) {
		// TODO ������ ���ϱ�
		int[][] array = new int[3][4];
		
		Random ran = new Random();
		
		/*
		 * 2�� �迭�� �� �ֱ�
		 */
		
		// ������ 
		array = new int[4][4];
		int sum = 0;
		
		for (int i =0; 1 < array.length; i++) {
			for (int j = 0; j < array[i].length ; j++) {
				array[i][j] = ran.nextInt(50) +1;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 ; j++) {
				sum += array [j][i]; //���� �ձ��ϱ�
			}
			array[3][i] = sum;
			sum = 0;
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]); // ��迭 ���� ���
			}
			System.out.println(); // ���� ���� �� ��� ���κ���
		}
		
		

	}

}
