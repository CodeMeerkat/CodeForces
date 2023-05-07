import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/723/A">The New Year: Meeting Friends</a>
 * @author codemeerkat
 */

public class TheNewYearMeetingFriends {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1, x2, x3;
		int point;
		int distanceX1, distanceX2, distanceX3;
		
		int resultDistance = 0;
		
		x1 = scanner.nextInt();
		x2 = scanner.nextInt();
		x3 = scanner.nextInt();
		
		point = (x1 + x2 + x3) / 3;
		
		distanceX1 = Math.abs(point - x1);
		distanceX2 = Math.abs(point - x2);
		distanceX3 = Math.abs(point - x3);
		
		if (distanceX1 <= distanceX2 && distanceX1 <= distanceX3) { // smallest : distanceX1
			point = x1;
		} else if (distanceX2 <= distanceX1 && distanceX2 <= distanceX3) {  // smallest : distanceX2
			point = x2;
		} else {  // smallest : distanceX3
			point = x3;
		}
		
		resultDistance += Math.abs(point - x1);
		resultDistance += Math.abs(point - x2);
		resultDistance += Math.abs(point - x3);
		
		System.out.println(resultDistance);
	}

}
