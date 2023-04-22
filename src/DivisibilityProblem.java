import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1328/A">Divisibility Problem</a>
 * @author codemeerkat
 */

public class DivisibilityProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			/* Fail for time limit
			while (a % b != 0) {
				moveCount++;
				a++;
			}
			*/
			
			// 10 / 4 => 2 = 4*3 - 10 = b*3 - a
			// 13 / 9 => 5 = 9*2 - 13 = b*2 - a
			// 20 / 9 => 7 = 9*3 - 20 = b*3 - a

			// (b * (a/b + 1)) - a
			
			if (a % b == 0) {
				System.out.println(0);
			} else {
				if ( a > b) {
					System.out.println(b * (a / b + 1) - a);
				} else {
					System.out.println(b - a);
				}
			}
		}
	}

}
