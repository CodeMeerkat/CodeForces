import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1294/A">Collecting Coins</a>
 * @author codemeerkat
 */

public class CollectingCoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a, b, c, n;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			n = scanner.nextInt();
			
			if (a >= b && a >= c) { // Maximum is a
				n -= (a-b);
				n -= (a-c);
			} else if(b >= a && b >= c) { // Maximum is b
				n -= (b-a);
				n -= (b-c);
			} else { // Maximum is c
				n -= (c-a);
				n -= (c-b);
			}
			
			if (n % 3 == 0 && n >= 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
