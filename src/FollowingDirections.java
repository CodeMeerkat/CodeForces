import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1791/B">Following Directions</a>
 * @author codemeerkat
 */

public class FollowingDirections {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		String s;
		int locationX, locationY;
		boolean isPassed;
		char move;
		
		for (int i = 0; i < testCase; i++) {
			locationX = 0;
			locationY = 0;
			n = scanner.nextInt();
			s = scanner.next();
			isPassed = false;
			
			for (int j = 0; j < n; j++) {
				move = s.charAt(j);
				
				if (move == 'L') {
					locationX--;
				} else if (move == 'R') {
					locationX++;
				} else if (move == 'U') {
					locationY++;
				} else { // move == 'D'
					locationY--;
				}
				
				if (locationX == 1 && locationY == 1) {
					isPassed = true;
					break;
				}
			}
			
			if (isPassed) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
