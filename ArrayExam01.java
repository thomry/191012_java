import java.util.Arrays;
import java.util.Random;

public class ArrayExam01 {

	public static void main(String[] args) {
		/**
		 * 1. 배열 6개짜리
		 * 2. 배열에 값을 넣을 때 중복제거
		 * 3. 값의 범위는 1~20사이의 랜덤값
		 * 4. 오름차순 정리
		 */
		
		int[] array = new int[6];  // 6개 배열 선언
		
		Random ran = new Random(); // 랜덤을 위한 랜덤클래스 생성
		
		int tempValue = 0;         // 임시 변수
		int indexCount = 0;        // 배열의 index값 저장을 위한 변수
		boolean isDuplicated = false;
		
		while (indexCount < 6) {
			
			tempValue = ran.nextInt(20) +1;
			
			if (indexCount == 0) {
				array[indexCount] = tempValue;
				indexCount++;      // 다음 index에 집어넣기위해 증가시킬것
			}else {                // 중복 비교
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
					isDuplicated = false; //다음 비교위해 초기화
				}
			}
		} // 중복 제거를 통한 값 넣기 끝 --------------------------------------
		// 버블 정렬을 위한 소팅
		for (int i = (array.length -1); i>0 ; i --) {
			for(int j=0; j <1; j++) {
				if (array[j] > array[j+1]) {
					tempValue  = array[j+1];
					array[j+1] = array[j];
					array[j]   = tempValue;
				}
			}
		} // 버블 정렬 끝 -------------------------------------------------
		
		for (int i = 0; i <array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println(); // 줄 바꿈
		System.out.println(Arrays.toString(array)); // array 출력

	}

}
