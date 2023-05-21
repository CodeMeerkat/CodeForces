import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1360/A">Minimal Square</a>
 * @author codemeerkat
 */

public class MinimalSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a, b;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			if (a > b) {
				b *= 2;
			} else if (b > a) {
				a *= 2;
			} else { // a == b
				b *= 2;
			}

			if (a > b) {
				System.out.println(a * a);
			} else {
				System.out.println(b * b);
			}
		}
	}

}
