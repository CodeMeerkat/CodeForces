import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/96/A">Football</a>
 * @author codemeerkat
 */

public class Football {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if (input.contains("0000000") || input.contains("1111111")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
