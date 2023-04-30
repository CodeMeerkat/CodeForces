import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/486/A">Calculating Function</a>
 * @author codemeerkat
 */

public class CalculatingFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		
		// f(1) = -1
		// f(2) = -1 + 2 = 1
		// f(3) = -(1+3) + 2  = -2
		// f(4) = -(1+3) + (2+4) = 2
		// f(5) = -(1+3+5) + (2+4) = -3
		// f(6) = -(1+3+5) + (2+4+6) = 3
		
		// -1 1 -2 2 -3 3
		
		if (n % 2 == 0) { // even
			System.out.println((n+1)/2);
		} else { // odd
			System.out.println(((n+1)/2) * (-1));
		}
	}

}
