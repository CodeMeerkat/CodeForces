import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/233/A">Perfect Permutation</a>
 * @author codemeerkat
 */

public class PerfectPermutation {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			for (int i = n; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print(-1);
		}
	}
 
}