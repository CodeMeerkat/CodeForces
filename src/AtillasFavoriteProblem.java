import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1760/B">Atilla's Favorite Problem</a>
 * @author codemeerkat
 */

public class AtillasFavoriteProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String alphabetString = "abcdefghijklmnopqrstuvwxyz";
		int n;
		String sString;
		char currentChar;
		int highestCharIndex;

		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			sString = scanner.next();
			highestCharIndex = -1;
			
			for (int j = 0; j < n; j++) {
				currentChar = sString.charAt(j);
				
				if (alphabetString.indexOf(currentChar) > highestCharIndex) {
					highestCharIndex = alphabetString.indexOf(currentChar);
				}
			}
			
			System.out.println(highestCharIndex+1);
		}
	}

}
