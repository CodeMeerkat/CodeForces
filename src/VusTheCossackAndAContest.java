import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1186/A">Vus the Cossack and a Contest</a>
 * @author codemeerkat
 */

public class VusTheCossackAndAContest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		
		if (m < n || k < n) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
