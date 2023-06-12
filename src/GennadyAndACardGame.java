import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1097/A">Gennady and a Card Game</a>
 * @author codemeerkat
 */

public class GennadyAndACardGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String cardInHand;
		boolean ispossible = false;
		
		for (int i = 0; i < 5; i++) {
			cardInHand = scanner.next();
			
			if (input.charAt(0) == cardInHand.charAt(0) || input.charAt(1) == cardInHand.charAt(1)) {
				ispossible = true;
				break;
			}
		}
		
		if (ispossible) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
