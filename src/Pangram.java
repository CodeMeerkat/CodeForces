import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/520/A">Pangram</a>
 * @author codemeerkat
 */

public class Pangram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int letterCount = scanner.nextInt();
		String inputString = scanner.next().toLowerCase();
		String outputString = "";
		
		for (int i = 0; i < letterCount; i++) {
			if (inputString.indexOf(inputString.charAt(i)) == i) {
				outputString += inputString.charAt(i);
			}
		}
		
		if (outputString.length() == 26) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
