import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/703/A">Mishka and Game</a>
 * @author codemeerkat
 */

public class MishkaAndGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int winningCount = 0;

		int m;
		int c;
		
		for (int i = 0; i < testCase; i++) {
			m = scanner.nextInt();
			c = scanner.nextInt();
			
			if (m > c) {
				winningCount++;
			} else if (m < c) {
				winningCount--;
			}
		}
		
		if (winningCount > 0) {
			System.out.println("Mishka");
		} else if (winningCount < 0) {
			System.out.println("Chris");
		} else {
			System.out.println("Friendship is magic!^^");
		}
	}

}
