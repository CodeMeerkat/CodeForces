import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1825/problem/A">LuoTianyi and the Palindrome String</a>
 * @author codemeerkat
 */

public class LuoTianyiAndThePalindromeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		boolean isAllSameLetter;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			isAllSameLetter = true;
			
			for (int index = 1; index < input.length(); index++) {
				if (input.charAt(0) != input.charAt(index)) {
					isAllSameLetter = false;
				}
			}
			
			if (isAllSameLetter) {
				System.out.println(-1);
			} else {
				System.out.println(input.length()-1);
			}
		}
	}

}
