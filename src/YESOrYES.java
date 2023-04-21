import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1703/A">YES or YES?</a>
 * @author codemeerkat
 */

public class YESOrYES {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String input;
		
		for (int i = 0; i < count; i++) {
			input = scanner.next().toLowerCase();
			
			if (input.equals("yes")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
