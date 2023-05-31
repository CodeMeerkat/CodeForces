import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1462/A">Favorite Sequence</a>
 * @author codemeerkat
 */

public class FavoriteSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int[] bArray;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			bArray = new int[n];
			
			for (int j = 0; j < n; j++) {
				bArray[j] = scanner.nextInt();
			}

			if (n % 2 == 0) { // n is even
				for (int j = 0; j < n/2; j++) {
					System.out.print(bArray[j] + " ");
					System.out.print(bArray[n-j-1] + " ");
				}
			} else { // n is odd
				for (int j = 0; j <= n/2; j++) {
					if (j == n / 2) {
						System.out.print(bArray[j] + " ");
					} else {
						System.out.print(bArray[j] + " ");
						System.out.print(bArray[n-j-1] + " ");
					}
				}
			}
			
			System.out.println();
		}
	}

}
