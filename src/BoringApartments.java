import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1433/A">Boring Apartments</a>
 * @author codemeerkat
 */

public class BoringApartments {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		int inputLength;
		int count;
		int digit;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			inputLength = input.length();
			digit = input.charAt(0) - '0';

			count = (digit - 1) * 10;
			
			if (inputLength == 1) {
				count += 1;
			} else if (inputLength == 2) {
				count += 3;
			} else if (inputLength == 3) {
				count += 6;
			} else {
				count += 10;
			}
			
			System.out.println(count);
		}
	}

}
