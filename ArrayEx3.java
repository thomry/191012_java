
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++)          // �迭 arr�� 1~5�� ����
			arr[i] = i + 1;
		
		System.out.println("[������]");
		System.out.println("arr.length:"+arr.length); // 5��
		
		for (int i = 0; i < arr.length; i++)          // �迭 arr�� �ϳ��� ���
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];            // arr�� ���̸� 2��� �ø� �迭�� tmp�� ����
		
		for (int i =0; i < arr.length; i++)           // arr�� ����� ���� tmp�� ����
			tmp[i] = arr[i];
		
		arr = tmp;                                    // tmp�� ����� ���� arr�� ����
		
		System.out.println("[������]");
		System.out.println("arr.length:"+arr.length); // arr ����
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]); // arr �ϳ��� ���� ���

	}

}
