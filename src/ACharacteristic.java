import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1823/problem/A">A-characteristic</a>
 * @author codemeerkat
 */

public class ACharacteristic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int arrayLength;
		int characteristic;
		int innerTestCase;
		
		int numberOfCase;
		
		int oneCount = 0;
		int minusOneCount = 0;
		
		boolean isFind;
		
		for (int i = 0; i < testCase; i++) {
			arrayLength = scanner.nextInt();
			characteristic = scanner.nextInt();
			isFind = false;
			
			innerTestCase = (arrayLength / 2) + 1;
			
			for (int j = 0; j < innerTestCase; j++ ) {
				oneCount = arrayLength - j;
				minusOneCount = j;
				numberOfCase = 0;
				
				if (oneCount > 1) {
					numberOfCase += oneCount * (oneCount-1) / 2;
				}
				
				if (minusOneCount > 1) {
					numberOfCase += minusOneCount * (minusOneCount-1) / 2;
				}
				
				if (numberOfCase == characteristic) {
					isFind = true;
					break;
				}
			}
			
			if (isFind) {
				System.out.println("YES");
				
				for (int j = 0; j < oneCount; j++) {
					System.out.print(1 + " ");
				}
				for (int j = 0; j < minusOneCount; j++) {
					System.out.print(-1 + " ");
				}
				System.out.println();
			} else {
				System.out.println("NO");
			}
		}
	}

}
