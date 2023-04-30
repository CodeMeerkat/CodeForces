import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/467/A">George and Accommodation</a>
 * @author codemeerkat
 */

public class GeorgeAndAccommodation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberRoom = scanner.nextInt();
		int p;
		int q;
		
		int result = 0;
		
		for (int i = 0; i < numberRoom; i++) {
			p = scanner.nextInt();
			q = scanner.nextInt();
		
			if (p + 2 <=  q) {
				result++;
			}
		}
		
		System.out.println(result);
	}

}
