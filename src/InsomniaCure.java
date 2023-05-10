import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/148/A">Insomnia cure</a>
 * @author codemeerkat
 */

public class InsomniaCure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		
		int unharmedCount = 0;
		
		for (int i = 1; i <= d; i++) {
			if ((i % k != 0) && (i % l != 0) && (i % m != 0) && (i % n != 0)) {
				unharmedCount++;
			}
		}
		
		System.out.println(d - unharmedCount);
	}

}
