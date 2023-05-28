import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1454/A">Special Permutation</a>
 * @author codemeerkat
 */

public class SpecialPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			
			if (n % 2 == 0) {
				for (int j = n; j > 0; j--) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = n; j > 0; j--) {
					if (j == n) {
						System.out.print((n / 2 + 1) + " ");
					} else if (j == (n / 2 + 1)) {
						System.out.print(n + " ");
					} else {
						System.out.print(j + " ");
					}
				}
			}
			System.out.println();
		}
	}

}
