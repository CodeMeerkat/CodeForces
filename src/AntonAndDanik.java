import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/734/A">Anton and Danik</a>
 * @author codemeerkat
 */

public class AntonAndDanik {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gameCount = Integer.parseInt(scanner.nextLine());
		String winnerString = scanner.nextLine();
		int winningCount = 0; // positive A, nagative D
		
		for (int i = 0; i < gameCount; i++) {
			if (winnerString.charAt(i) == 'A') {
				winningCount++;
			} else {
				winningCount--;
			}
		}
		
		if (winningCount > 0) {
			System.out.println("Anton");
		} else if (winningCount < 0) {
			System.out.println("Danik");
		} else {
			System.out.println("Friendship");
		}
	}

}
