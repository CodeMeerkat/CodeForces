import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/268/A">Games</a>
 * @author codemeerkat
 */

public class Games {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teamCount = scanner.nextInt();
		int resultCount = 0;
		
		int[] homeColorArray = new int[teamCount];
		int[] guestColorArray = new int[teamCount];
		
		for (int i = 0; i < teamCount; i++) {
			homeColorArray[i] = scanner.nextInt();
			guestColorArray[i] = scanner.nextInt();
		}
		
		for (int homeIndex=0; homeIndex < teamCount; homeIndex++) {
			for (int guestIndex = 0; guestIndex < teamCount; guestIndex++) {
				
				if (homeIndex == guestIndex) {
					continue;
				}
				
				if (homeColorArray[homeIndex] == guestColorArray[guestIndex]) {
					resultCount++;
				}
			}
		}
		
		System.out.println(resultCount);
		
	}

}
