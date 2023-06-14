import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1660/A">Vasya and Coins</a>
 * @author codemeerkat
 */

public class VasyaAndCoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a, b;
		int s;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			if (a > 0) {
				s = a + (2 * b);
			} else {
				s = 0;
			}
			
			System.out.println(s+1);
		}
	}

}
