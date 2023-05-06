import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/431/A">Black Square</a>
 * @author codemeerkat
 */

public class BlackSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int a4 = scanner.nextInt();
		String input = scanner.next();
		
		int result = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1') {
				result += a1;
			}
			
			if (input.charAt(i) == '2') {
				result += a2;
			}
			
			if (input.charAt(i) == '3') {
				result += a3;
			}
			
			if (input.charAt(i) == '4') {
				result += a4;
			}
		}
		
		System.out.println(result);
	}

}
