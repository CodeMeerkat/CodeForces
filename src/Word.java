import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/59/A">Word</a>
 * @author codemeerkat
 */

public class Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String output = "";
		int lowercaseCount = 0;
		int uppercaseCount = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				uppercaseCount++;
			} else {
				lowercaseCount++;
			}
		}
		
		if (uppercaseCount > lowercaseCount) {
			output = input.toUpperCase();
		} else {
			output = input.toLowerCase();
		}
		
		System.out.println(output);
	}

}
