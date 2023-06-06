import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1579/A">Casimir's String Solitaire</a>
 * @author codemeerkat
 */

public class CasimirsStringSolitaire {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		int acCount, bCount;
		
		for (int i = 0; i < testCase; i++) {
			acCount = 0;
			bCount = 0;
			input = scanner.next();
			
			if (input.length() % 2 == 0) {
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(j) == 'B') {
						bCount++;
					} else {
						acCount++;
					}
				}
				
				if (bCount == acCount) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				
			} else {
				System.out.println("NO");
			}
		}
	}

}
