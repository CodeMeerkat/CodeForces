import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1353/A">Most Unstable Array</a>
 * @author codemeerkat
 */

public class MostUnstableArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n, m;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			
			if (n == 1) {
				System.out.println(0);
			} else if (n == 2) {
				System.out.println(m);
			} else {
				System.out.println(m * 2);
			}
		}
	}

}
