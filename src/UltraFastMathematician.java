import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/61/A">Ultra-Fast Mathematician</a>
 * @author codemeerkat
 */

public class UltraFastMathematician {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstInput = scanner.nextLine();
		String secondInput = scanner.nextLine();
		
		for (int i = 0 ; i < firstInput.length(); i++) {
			if (firstInput.charAt(i) == secondInput.charAt(i)) {
				System.out.print(0);
			} else {
				System.out.print(1);
			}
		}
	}

}
