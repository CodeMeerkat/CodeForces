import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1814/A">Coins</a>
 * @author codemeerkat
 */

public class Coins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		long n, k;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextLong();
			k = scanner.nextLong();
			
			if (n % 2 != 0 && k % 2 == 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

}
