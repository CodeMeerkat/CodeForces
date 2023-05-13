import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1426/A">Floor Number</a>
 * @author codemeerkat
 */

public class FloorNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n, x;
		int floor;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			x = scanner.nextInt();
			
			// floor n
			// 1st 1, 2
			// 2nd 3, ..., x+2
			// 3rd x+3, ..., 2x+2
			// 4th 2x+3, ... , 3x+2
			
			if (n < 3) {
				floor = 1;
			} else {
				n -= 3;
				floor = n/x + 2;
			}

			System.out.println(floor);
		}
	}

}
