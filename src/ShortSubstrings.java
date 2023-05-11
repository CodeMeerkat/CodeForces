import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1367/A">Short Substrings</a>
 * @author codemeerkat
 */

public class ShortSubstrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		String output;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			output = input.substring(0, 2);

			for (int j=2; j<=input.length()/2; j++) {
				output += input.charAt(j * 2 - 1);
			}
			
			System.out.println(output);
		}
	}

}
