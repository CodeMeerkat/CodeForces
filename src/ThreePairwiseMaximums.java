import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1385/A">Three Pairwise Maximums</a>
 * @author codemeerkat
 */

public class ThreePairwiseMaximums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int[] inputArray;
		
		for (int i = 0; i < testCase; i++) {
			inputArray = new int[3];
			
			for (int j = 0; j < 3; j++) {
				inputArray[j] = scanner.nextInt();
			}
			
			Arrays.sort(inputArray);
			
			if (inputArray[1] != inputArray[2]) {
				System.out.println("NO");
			} else {
				System.out.println("YES");

				System.out.print(inputArray[0] + " " + inputArray[0] + " " + inputArray[2]);
				
				System.out.println();
			}
		}
	}

}
