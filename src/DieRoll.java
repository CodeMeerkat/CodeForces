import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/9/A">Die Roll</a>
 * @author codemeerkat
 */

public class DieRoll {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int y = scanner.nextInt();
		int w = scanner.nextInt();

		// form : numerator/denominator
		int numerator = 6 - (Math.max(y, w)) + 1;
		int denominator = 6;
		
		// 0/6 1/6 2/6 3/6 4/6 5/6 6/6
		// 0/1 1/6 1/3 1/2 2/3 5/6 1/1
		
		if (numerator == 0) {
			denominator = 1;
		} else if (numerator == 2) {
			numerator = 1;
			denominator = 3;
		} else if (numerator == 3) {
			numerator = 1;
			denominator = 2;
		} else if (numerator == 4) {
			numerator = 2;
			denominator = 3;
		} else if (numerator == 6) {
			numerator = 1;
			denominator = 1;
		}
		
		System.out.println(numerator + "/" + denominator);
	}

}
