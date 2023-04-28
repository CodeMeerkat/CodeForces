import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/158/A">Next Round</a>
 * @author codemeerkat
 */

public class NextRound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int targetIndex = scanner.nextInt();
		int targetValue;
		int resultCount = 0;
		
		int[] array = new int[length];
		
		for (int i = 0 ; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		
		targetValue = array[targetIndex-1];
		
		for (int i = 0 ; i < length; i++) {
			if (array[i] >= targetValue && array[i] > 0) {
				resultCount++;
			}
		}
		
		System.out.println(resultCount);
	}

}
