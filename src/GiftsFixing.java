import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1399/B">Gifts Fixing</a>
 * @author codemeerkat
 */

public class GiftsFixing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int[] aArray;
		int[] bArray;
		int minimumA;
		int minimumB;
		long moveCount;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			aArray = new int[n];
			bArray = new int[n];
			moveCount = 0;
			
			aArray[0] = scanner.nextInt();
			minimumA = aArray[0];
			for (int j = 1; j < n; j++) {
				aArray[j] = scanner.nextInt();
				
				if (aArray[j] < minimumA) {
					minimumA = aArray[j];
				}
			}
			
			bArray[0] = scanner.nextInt();
			minimumB = bArray[0];
			for (int j = 1; j < n; j++) {
				bArray[j] = scanner.nextInt();
				
				if (bArray[j] < minimumB) {
					minimumB = bArray[j];
				}
			}
			
			for (int j = 0; j < n; j++) {
				if (aArray[j] == minimumA && bArray[j] == minimumB) {
					continue;
				} else if (aArray[j] != minimumA && bArray[j] != minimumB) {
					if ((aArray[j] - minimumA) > (bArray[j] - minimumB)) {
						moveCount += aArray[j] - minimumA;
					} else {
						moveCount += bArray[j] - minimumB;
					}
				} else {
					moveCount += aArray[j] - minimumA;
					moveCount += bArray[j] - minimumB;
				}
			}
			
			System.out.println(moveCount);
		}
	}

}
