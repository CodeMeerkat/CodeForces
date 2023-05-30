import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1722/B">Colourblindness</a>
 * @author codemeerkat
 */

public class Colourblindness {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		String s1, s2;
		boolean isIdentical;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			s1 = scanner.next();
			s2 = scanner.next();
			isIdentical = true;
			
			for (int j = 0; j < n; j++) {
				if ((s1.charAt(j) == 'R' && s2.charAt(j) != 'R') || (s1.charAt(j) != 'R' && s2.charAt(j) == 'R')) {
					isIdentical = false;
					break;
				}
			}
			
			if (isIdentical) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}

}
