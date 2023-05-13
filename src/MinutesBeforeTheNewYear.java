import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1283/A">Minutes Before the New Year</a>
 * @author codemeerkat
 */

public class MinutesBeforeTheNewYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int minutes;
		int newYearMinutes = 60 * 24;
		
		for (int i = 0; i < testCase; i++) {
			minutes = (60 * scanner.nextInt()) + scanner.nextInt();
			
			System.out.println(newYearMinutes - minutes);
		}
	}

}
