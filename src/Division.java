import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1669/A">Division?</a>
 * @author codemeerkat
 */

public class Division {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int currentRating;
		
		for (int i = 0; i < testCase; i++) {
			currentRating = scanner.nextInt();
			
			if (1900 <= currentRating) {
				System.out.println("Division 1");
			} else if (1600 <= currentRating && currentRating <= 1899) {
				System.out.println("Division 2");
			} else if (1400 <= currentRating && currentRating <= 1599) {
				System.out.println("Division 3");
			} else {
				System.out.println("Division 4");
			}
		}
	}

}
