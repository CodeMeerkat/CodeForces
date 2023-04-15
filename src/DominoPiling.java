import java.util.Scanner;

/**
 * See <a href="http://codeforces.com/problemset/problem/50/A">DominoPiling</a>
 * @author codemeerkat
 */

public class DominoPiling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		System.out.println(row * col / 2);
	}
}
