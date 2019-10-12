import java.util.*;  //arrays.toString()사용 위해 import

public class ArrayEx2 {

	public static void main(String[] args) {
		int [] iArr1 = new int[10];
		int [] iArr2 = new int[10];
		//int [] iArr3 = new int[] {100, 95, 80, 70, 60};
		int [] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for (int i=0; i < iArr1.length; i++) {       
			iArr1[i] = i+1;                         // 1~10의 숫자를 순서대로 배열에 입력
		}
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 랜덤한 1~10의 값을 배열에 입력
		}
		for (int i=0; i < iArr1.length; i++) {      // 배열의 요소를 순서대로 하나씩출력. 구분위해 쉼표 출력.
			System.out.print(iArr1[i]+",");
		}
		System.out.println();                       // 줄바꿔줌
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);                  // I = 1차원 int 배열. 타입@주소의 '내부주소'가 출력됨
		System.out.println(chArr);

	}

}
