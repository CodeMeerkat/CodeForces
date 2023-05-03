import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1692/A">Marathon</a>
 * @author codemeerkat
 */

public class Marathon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int resultCount;
		int a;
		
		for (int i = 0; i < testCase; i++) {
			resultCount = 0;
			
			a = scanner.nextInt();
			
			for (int j = 0; j < 3; j++) {
				if (scanner.nextInt() > a) {
					resultCount++;
				}
			}

			System.out.println(resultCount);
		}
		
	}

}
