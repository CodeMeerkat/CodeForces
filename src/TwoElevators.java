import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1729/A">Two Elevators</a>
 * @author codemeerkat
 */

public class TwoElevators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int a, b, c;
		int timeFirstOne, timeSecondOne;
		
		for (int i = 0; i < testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			timeFirstOne = a - 1;
			timeSecondOne = Math.abs(c - b) + (c -1); 
			
			if (timeFirstOne < timeSecondOne) {
				System.out.println(1);
			} else if (timeFirstOne > timeSecondOne) {
				System.out.println(2);
			} else { // timeFirstOne == timeSecondOne
				System.out.println(3);
			}
		}
	}

}
