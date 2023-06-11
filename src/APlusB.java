import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1772/A">A+B?</a>
 * @author codemeerkat
 */

public class APlusB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String expression;
		int a, b;
		
		for (int i = 0; i < testCase; i++) {
			expression = scanner.next();

			a = Integer.parseInt(expression.substring(0, 1));
			b = Integer.parseInt(expression.substring(2, 3));
			
			System.out.println(a + b);
		}
	}

}
