import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/758/A">Holiday Of Equality</a>
 * @author codemeerkat
 */

public class HolidayOfEquality {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int citizensCount = scanner.nextInt();
		int sum = 0;
		int maxWelfare = 0;
		int currentWelfare;
		
		for (int i = 0; i < citizensCount; i++) {
			currentWelfare = scanner.nextInt();
			
			sum += currentWelfare;
			
			if (currentWelfare > maxWelfare) {
				maxWelfare = currentWelfare;
			}
		}
		
		System.out.println(maxWelfare * citizensCount - sum);
	}

}
