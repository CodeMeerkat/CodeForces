import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/791/A">Bear and Big Brother</a>
 * @author codemeerkat
 */

public class BearAndBigBrother {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int weightLimak = scanner.nextInt();	// weight is tripled after every year 
		int weightBob = scanner.nextInt();		// weight is doubled after every year
		int yearCount = 0;
		
		while (!(weightLimak > weightBob)) {
			weightLimak *= 3;
			weightBob *= 2;
			
			yearCount++;
		}
		
		System.out.println(yearCount);
	}

}
