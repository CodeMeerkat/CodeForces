import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1676/A">Lucky?</a>
 * @author codemeerkat
 */

public class Lucky {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		String input;
		int sumFront;
		int sumBack;
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			sumFront = 0;
			sumBack = 0;
			
			for (int j = 0; j < 3; j++) {
				sumFront += input.charAt(j) - '0';
			}

			for (int j = 3; j < 6; j++) {
				sumBack += input.charAt(j) - '0';
			}
			
			if (sumFront == sumBack) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

}
