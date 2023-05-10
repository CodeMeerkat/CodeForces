import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/151/A">Soft Drinking</a>
 * @author codemeerkat
 */

public class SoftDrinking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int nl = scanner.nextInt();
		int np = scanner.nextInt();
		
		System.out.println(Math.min(k * l / nl, Math.min(c * d, p / np)) / n);
	}

}
