import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1399/A">Remove Smallest</a>
 * @author codemeerkat
 */

public class RemoveSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int arrayLength;
		int[] array;
		
		boolean isPossible;
		
		for (int i = 0; i < testCase; i++) {
			arrayLength = scanner.nextInt();
			array = new int[arrayLength];
			isPossible = true;
			
			// Setting array
			for (int j = 0; j < arrayLength; j++) {
				array[j] = scanner.nextInt();
			}
			
			Arrays.sort(array);
			
			for (int j = 1; j < arrayLength; j++) {
				if (Math.abs(array[j-1] - array[j]) > 1) {
					isPossible = false;
				}
			}
			
			if (isPossible) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}

}
