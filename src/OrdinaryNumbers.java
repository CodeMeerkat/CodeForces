import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1520/B">Ordinary Numbers</a>
 * @author codemeerkat
 */

public class OrdinaryNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		int input = 0;
		int inputDigits = 0;
		int count = 0;
		double compareNum = 0;
		String compareNumString = "";
		
		for (int i = 0; i < testCount; i++) {
			input = scanner.nextInt();
			inputDigits = String.valueOf(input).length();
			compareNumString = "";
			
			// one digit number 1 / two digit number 11 / three digit number 111
			for(int j = 0; j < inputDigits; j++) {
				compareNumString += "1";
			}
			compareNum = Double.parseDouble(compareNumString);
			
			
			// Add lower digits
			// one digit number 9x0 / two digit number 9x1 / three digit number 9x2
			count = 9 * (inputDigits - 1);
			
			// Check same digits
			for (int j = 1; j < 10; j++) {
				if (input >= (compareNum * j)) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
