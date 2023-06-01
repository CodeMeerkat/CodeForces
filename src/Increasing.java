import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1742/B">Increasing</a>
 * @author codemeerkat
 */

public class Increasing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int[] aArray;
		boolean isIncreasing;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			aArray = new int[n];
			isIncreasing = true;
			
			for (int j = 0; j < n; j++) {
				aArray[j] = scanner.nextInt();
			}

			Arrays.sort(aArray);
			
			
			for (int j = 0; j < n-1; j++) {
				if (aArray[j] >= aArray[j+1]) {
					isIncreasing = false;
					break;
				}
			}
			
			if (isIncreasing) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
