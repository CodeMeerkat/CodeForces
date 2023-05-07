import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1829/problem/A">Love Story</a>
 * @author codemeerkat
 */

public class LoveStory {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		int count;
		String codeforcesStr = "codeforces";
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			count = 0;
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) != codeforcesStr.charAt(j)) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
