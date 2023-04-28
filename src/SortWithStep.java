import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1823/problem/B">Sort with Step</a>
 * @author codemeerkat
 */

public class SortWithStep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int arrayLength;
		int distance;
		int[] array;
		int wrongPositionCount;
		
		for (int i = 0; i < testCase; i++) {
			arrayLength = scanner.nextInt();
			distance = scanner.nextInt();
			array = new int[arrayLength];
			wrongPositionCount = 0;
			
			for (int index = 0; index < arrayLength; index++) {
				array[index] = scanner.nextInt();
			}
			
			if (distance == 1) {
				System.out.println(0);
				continue;
			}
			
			for (int index = 0; index < arrayLength; index++) {
				if ((array[index] - 1 - index) % distance != 0) {
					wrongPositionCount++;
				}
			}
			
			if (wrongPositionCount == 0) {
				System.out.println(0);
			} else if (wrongPositionCount > 2) {
				System.out.println(-1);
			} else {
				System.out.println(1);
			}
		}
		
	}

}
