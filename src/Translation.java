import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/41/A">Translation</a>
 * @author codemeerkat
 */

public class Translation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String wordS = scanner.nextLine();
		String wordT = scanner.nextLine();
		String reversedWordS = "";
		
		for (int i = wordS.length()-1; i >= 0; i--) {
			reversedWordS += wordS.charAt(i);
		}
		
		if (wordT.equals(reversedWordS)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

}
