import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1807/B">Grab the Candies</a>
 * @author codemeerkat
 */

public class GrabTheCandies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n, current;
		int countMihai, countBianca;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			countMihai = 0;
			countBianca = 0;
			
			for (int j = 0; j < n; j++) {
				current = scanner.nextInt();
				
				if (current % 2 == 0) {
					countMihai += current;
				} else {
					countBianca += current;
				}
			}
			
			if (countMihai > countBianca) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
