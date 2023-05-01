import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1335/A">Candies and Two Sisters</a>
 * @author codemeerkat
 */

public class CandiesAndTwoSisters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n = 0;
		int result;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			result = ((n+1) / 2 ) - 1;
			
			System.out.println(result);
		}
	}

}
