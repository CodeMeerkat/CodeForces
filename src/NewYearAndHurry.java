import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/750/A">New Year and Hurry</a>
 * @author codemeerkat
 */

public class NewYearAndHurry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int problems = scanner.nextInt();
		int time = scanner.nextInt();
		int resolvedProblems = 0;

		time = 240 - time;
		
		for (int i = 1; i <= problems; i++) {
			time -= (5*i);
			if (time >= 0 ) {
				resolvedProblems++;
			}
		}
		
		System.out.println(resolvedProblems);
	}

}
