import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/935/A">Fafa and his Company</a>
 * @author codemeerkat
 */

public class FafaAndHisCompany {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 1;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
