import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1368/A">C+=</a>
 * @author codemeerkat
 */

public class CPE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a, b, n;
		int count;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			n = scanner.nextInt();
			count = 0;
			
			while (a <= n && b <= n) {
				if (a > b) {
					b += a;
				} else {
					a += b;
				}
				
				count++;
			}
			
			System.out.println(count);
		}
	}

}
