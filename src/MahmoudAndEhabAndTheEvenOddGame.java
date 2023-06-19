import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/959/A">Mahmoud and Ehab and the even-odd game</a>
 * @author codemeerkat
 */

public class MahmoudAndEhabAndTheEvenOddGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Mahmoud");
		} else {
			System.out.println("Ehab");
		}
	}

}
