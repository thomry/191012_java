
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++)          // 배열 arr에 1~5를 저장
			arr[i] = i + 1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length); // 5개
		
		for (int i = 0; i < arr.length; i++)          // 배열 arr을 하나씩 출력
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];            // arr의 길이를 2배로 늘린 배열을 tmp로 저장
		
		for (int i =0; i < arr.length; i++)           // arr에 저장된 값을 tmp에 복사
			tmp[i] = arr[i];
		
		arr = tmp;                                    // tmp에 저장된 값을 arr에 저장
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length); // arr 길이
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]); // arr 하나씩 전부 출력

	}

}
