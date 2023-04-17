import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/281/A">Word Capitalization</a>
 * @author codemeerkat
 */

public class WordCapitalization {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String output = input.substring(0, 1).toUpperCase() + input.substring(1);
		
		System.out.println(output);
	}

}
