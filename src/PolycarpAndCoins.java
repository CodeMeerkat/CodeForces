import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1551/A">Polycarp and Coins</a>
 * @author codemeerkat
 */

public class PolycarpAndCoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			
			if (n % 3 == 0) {
				System.out.println((n/3) + " " + (n/3));
			} else if (n % 3 == 1) {
				System.out.println((n/3 + 1) + " " + (n/3));
			} else { // n % 3 == 2
				System.out.println((n/3) + " " + (n/3 + 1));
			}
		}
	}

}
