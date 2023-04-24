import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1742/A">Sum</a>
 * @author codemeerkat
 */

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int[] array = new int[3];
		
		for (int i = 0; i < testCase; i++) {
			array[0] = scanner.nextInt();
			array[1] = scanner.nextInt();
			array[2] = scanner.nextInt();
			
			Arrays.sort(array);
			
			if (array[2] == array[0] + array[1]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
