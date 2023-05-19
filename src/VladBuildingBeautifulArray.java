import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1833/problem/C">Vlad Building Beautiful Array</a>
 * @author codemeerkat
 */

public class VladBuildingBeautifulArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int[] aArray;
		
		int smallestOdd;

		boolean isBeautifulOdd;
		boolean isBeautifulEven;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			aArray = new int[n];
			
			smallestOdd = -1;
			isBeautifulEven = true;
			isBeautifulOdd = true;
			
			for (int j = 0; j < n; j++) {
				aArray[j] = scanner.nextInt();
			}
			
			Arrays.sort(aArray);

			for (int j = 0; j < n; j++) {
				if (smallestOdd == -1 && aArray[j] % 2 == 1) {
					smallestOdd = aArray[j];
				}
				
				if (smallestOdd != -1) {
					break;
				}
			}
			
			// Odd case
			for (int j = 0; j < n; j++) {
				if ((aArray[j] % 2 == 0) && (aArray[j] - smallestOdd < 0)) {
					isBeautifulOdd = false;
					break;
				}
			}
						
			// Even case
			for (int j = 0; j < n; j++) {
				if (aArray[j] % 2 == 1) {
					isBeautifulEven = false;
					break;
				}
			}
			
			if (isBeautifulOdd || isBeautifulEven) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
