import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1837/problem/A">Grasshopper on a Line</a>
 * @author codemeerkat
 */

public class GrasshopperOnALine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int x, k;
		
		for (int i = 0; i < testCase; i++) {
			x = scanner.nextInt();
			k = scanner.nextInt();
			
			if (x % k != 0 && x != k) {
				System.out.println(1);
				System.out.println(x);
			} else if (x == k) {
				System.out.println(2);
				System.out.println(-1 + " " + (x+1));
			} else {
				System.out.println(2);
				System.out.println(k+1 + " " + (x-k-1));
			}
		}
	}

}
