import java.util.Random;

public class DoubleArrayTest01 {

	public static void main(String[] args) {
		int[][] array = new int[3][4];
		
		Random ran = new Random();
		
		/*
		 * 2�� �迭�� �� �ֱ�
		 */
		
		for (int i =0; 1 < array.length; i++) {
			for (int j = 0; j < array[i].length ; j++) {
				array[i][j] = ran.nextInt(50) +1;
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {             // �� ���� �� ���غ���
			for (int j = 0; j < array[i].length ; j++) {
				sum += array[i][j]; // ���� �� ���ϱ�
				System.out.print(array[i][j]+"\t"); // ��迭 ���� ���
			}
			
			System.out.println(sum); // ���� ���� ����� ���κ���
			sum = 0; // ���� ���ϱ⸦ ���� �ʱ�ȭ
		}

	}

}
