import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/472/A">Design Tutorial: Learn from Math</a>
 * @author codemeerkat
 */

public class DesignTutorialLearnFromMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int evenNumForOddCase = 4;
		
		if (input % 2 == 0) { // even
			System.out.print(4 + " ");
			System.out.print(input - 4);
		} else { // odd
			while ((input - evenNumForOddCase) % 3 != 0) {
				evenNumForOddCase += 2;
			}
			
			System.out.print(evenNumForOddCase + " ");
			System.out.print(input - evenNumForOddCase);
		}
	}

}
