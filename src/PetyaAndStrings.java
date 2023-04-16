import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/112/A">PetyaAndStrings</a>
 * @author codemeerkat
 */

public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.nextLine();
		String secondString = scanner.nextLine();
		
		int resultCompareTo = firstString.compareToIgnoreCase(secondString);
		
		if (resultCompareTo > 0) {
			System.out.println(1);
		} else if (resultCompareTo < 0) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}
	}
}
