import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1409/A">Yet Another Two Integers Problem</a>
 * @author codemeerkat
 */

public class YetAnotherTwoIntegersProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int start;
		int goal;
		int interval;
		
		for (int i = 0; i < testCase; i++) {
			start = scanner.nextInt();
			goal = scanner.nextInt();
			
			interval = goal - start;
			if (interval < 0) {
				interval *= -1;
			}
			
			if (interval == 0) {
				System.out.println(0);
			} else if (interval % 10 != 0) {
				System.out.println(interval / 10 + 1);
			} else {
				System.out.println(interval / 10);
			}
		}
		
	}
}
