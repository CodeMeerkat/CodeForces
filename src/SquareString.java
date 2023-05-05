import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1619/A">Square String?</a>
 * @author codemeerkat
 */

public class SquareString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		int inputLength;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			inputLength = input.length();
			
			if (inputLength % 2 == 0) { // even
				if (input.substring(0, inputLength/2).equals(input.substring(inputLength/2))) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else { // odd
				System.out.println("NO");
			}
		}
	}

}
