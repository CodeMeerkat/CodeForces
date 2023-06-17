import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1716/A">2-3 Moves</a>
 * @author codemeerkat
 */

public class TwoThreeMoves {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int  n;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			
			if (n == 1) {
				System.out.println(2);
			} else {
				if (n % 3 == 0) {
					System.out.println(n / 3);
				} else {
					System.out.println((n / 3) + 1);
				}
			}
		}
	}

}
