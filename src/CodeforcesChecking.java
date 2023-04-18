import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1791/A">Codeforces Checking</a>
 * @author codemeerkat
 */

public class CodeforcesChecking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCount = Integer.parseInt(scanner.nextLine());
		String currentLine;
		
		String codeforces = "codeforces";
		
		for (int i = 0; i < testCount; i++) {
			currentLine = scanner.nextLine();
			if (codeforces.contains(currentLine)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

}
