import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/509/A">Maximum in Table</a>
 * @author codemeerkat
 */

public class MaximumInTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nArray = new int[n];
		
		for (int i = 0; i < n; i++) {
			nArray[i] = 1;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				nArray[j] = nArray[j-1] + nArray[j];
			}
		}
		
		System.out.println(nArray[n-1]);
	}

}
