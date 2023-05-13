import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1535/A">Fair Playoff</a>
 * @author codemeerkat
 */

public class FairPlayoff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int leftSide, rightSide;
		int[] array = new int[4];
		
		for (int i = 0; i < testCase; i++) {
			for (int j = 0; j < 4; j++) {
				array[j] = scanner.nextInt();
			}
			
			if (array[0] > array[1]) {
				leftSide = array[0];
			} else {
				leftSide = array[1];
			}
			
			if (array[2] > array[3]) {
				rightSide = array[2];
			} else {
				rightSide = array[3];
			}
			
			Arrays.sort(array);
			
			if (leftSide + rightSide == array[2] + array[3]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
