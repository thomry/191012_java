import java.util.Arrays;
import java.util.Random;

public class ArrayExam01 {

	public static void main(String[] args) {
		/**
		 * 1. �迭 6��¥��
		 * 2. �迭�� ���� ���� �� �ߺ�����
		 * 3. ���� ������ 1~20������ ������
		 * 4. �������� ����
		 */
		
		int[] array = new int[6];  // 6�� �迭 ����
		
		Random ran = new Random(); // ������ ���� ����Ŭ���� ����
		
		int tempValue = 0;         // �ӽ� ����
		int indexCount = 0;        // �迭�� index�� ������ ���� ����
		boolean isDuplicated = false;
		
		while (indexCount < 6) {
			
			tempValue = ran.nextInt(20) +1;
			
			if (indexCount == 0) {
				array[indexCount] = tempValue;
				indexCount++;      // ���� index�� ����ֱ����� ������ų��
			}else {                // �ߺ� ��
				for (int i = 0; i <= indexCount; i++) {
					if (array[i] == tempValue) {
						isDuplicated = true;
						break;
					}
				}
				
				if(isDuplicated == false || tempValue != 0) {
					array[indexCount] = tempValue;
					indexCount++;
				}else {
					isDuplicated = false; //���� ������ �ʱ�ȭ
				}
			}
		} // �ߺ� ���Ÿ� ���� �� �ֱ� �� --------------------------------------
		// ���� ������ ���� ����
		for (int i = (array.length -1); i>0 ; i --) {
			for(int j=0; j <1; j++) {
				if (array[j] > array[j+1]) {
					tempValue  = array[j+1];
					array[j+1] = array[j];
					array[j]   = tempValue;
				}
			}
		} // ���� ���� �� -------------------------------------------------
		
		for (int i = 0; i <array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println(); // �� �ٲ�
		System.out.println(Arrays.toString(array)); // array ���

	}

}
