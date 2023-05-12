import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1520/A">Do Not Be Distracted!</a>
 * @author codemeerkat
 */

public class DoNotBeDistracted {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int letterLength;
		String input;
		boolean isSuspicious;
		
		for (int i = 0; i < testCase; i++) {
			letterLength = scanner.nextInt();
			input = scanner.next();
			isSuspicious = false;
			
			for (int j = 0; j < letterLength; j++) {
				if (j != 0 && input.charAt(j-1) == input.charAt(j)) {
					continue;
				}
				
				if (input.indexOf(input.charAt(j)) != j) {
					isSuspicious = true;
				}
			}
			
			if (isSuspicious) {
				System.out.println("NO");
			} else {
				System.out.println("YES");				
			}
			
		}
	}

}
