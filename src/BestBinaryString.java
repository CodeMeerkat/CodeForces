import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1837/problem/C">Best Binary String</a>
 * @author codemeerkat
 */

public class BestBinaryString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		boolean isZero;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			isZero = true;
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == '?' && j == 0) {
					System.out.print(0);
					isZero = true;
				} else if (input.charAt(j) == '?' && j == input.length() - 1) {
					System.out.print(1);
				} else if (input.charAt(j) == '?' && input.charAt(j-1) == '0') {
					System.out.print(0);
					isZero = true;
				} else if (input.charAt(j) == '?' && input.charAt(j-1) == '1') {
					System.out.print(1);
					isZero = false;
				} else if (input.charAt(j) == '?' && isZero) {
					System.out.print(0);
				} else if (input.charAt(j) == '?' && !isZero) {
					System.out.print(1);
				} else {
					System.out.print(input.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
