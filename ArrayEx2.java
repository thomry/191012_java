import java.util.*;  //arrays.toString()��� ���� import

public class ArrayEx2 {

	public static void main(String[] args) {
		int [] iArr1 = new int[10];
		int [] iArr2 = new int[10];
		//int [] iArr3 = new int[] {100, 95, 80, 70, 60};
		int [] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for (int i=0; i < iArr1.length; i++) {       
			iArr1[i] = i+1;                         // 1~10�� ���ڸ� ������� �迭�� �Է�
		}
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; // ������ 1~10�� ���� �迭�� �Է�
		}
		for (int i=0; i < iArr1.length; i++) {      // �迭�� ��Ҹ� ������� �ϳ������. �������� ��ǥ ���.
			System.out.print(iArr1[i]+",");
		}
		System.out.println();                       // �ٹٲ���
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);                  // I = 1���� int �迭. Ÿ��@�ּ��� '�����ּ�'�� ��µ�
		System.out.println(chArr);

	}

}