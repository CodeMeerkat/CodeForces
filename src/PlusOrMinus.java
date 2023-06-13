import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1807/A">Plus or Minus</a>
 * @author codemeerkat
 */

public class PlusOrMinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a, b, c;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			if ((a + b) == c) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}

}
