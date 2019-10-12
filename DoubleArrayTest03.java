
public class DoubleArrayTest03 {

	public static void main(String[] args) {
		
		String[][] axe = new String[9][9];
		
		int maxIndex = 8;
		
		for (int i = 0; i <= maxIndex; i++) { // x 표만들기
			for (int j = 0; j <= maxIndex; j++) {
				if (i == j) {
					axe[i][j] = "*";
				}else if( (i+j) == maxIndex) {
					axe[i][j] = "*";
				}else {
					axe[i][j] = " ";
				}
			}
		}
		
		for (int i = 0; i <= maxIndex; i++) {
			for (int j = 0; j <= maxIndex; j++) {
				System.out.print(axe[i][j]);
			}
			System.out.println();
		}

	}

}
