import java.util.Scanner;

/**
 * See <a href="http://codeforces.com/problemset/problem/4/A">Watermelon</a>
 * @author codemeerkat
 */

public class Watermelon {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.next());
		
		if (num == 2) {
			System.out.println("NO");
		} else {
			if (num % 2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
 
}