import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/702/A">Maximum Increase</a>
 * @author codemeerkat
 */

public class MaximumIncrease {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int maximumLength, currentLength;
		int currentInput, lastInput;
		
		currentLength = 1;
		maximumLength = currentLength;
		currentInput = scanner.nextInt();
		
		for (int i = 1; i < n; i++) {
			lastInput = currentInput;
			currentInput = scanner.nextInt();
			
			if (currentInput > lastInput) {
				currentLength++;
				
				if (currentLength > maximumLength) {
					maximumLength = currentLength;
				}
			} else {
				currentLength = 1;
			}
		}
		
		System.out.println(maximumLength);
	}

}
