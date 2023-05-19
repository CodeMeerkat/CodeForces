import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1370/A">Maximum GCD</a>
 * @author codemeerkat
 */

public class MaximumGCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int input;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.nextInt();
			
			System.out.println(input / 2);
		}
	}

}
