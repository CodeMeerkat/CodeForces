import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1821/problem/B">Sort the Subarray</a>
 * @author codemeerkat
 */

public class SortTheSubarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int intCount = 0;
		
		int sortStart;
		int sortEnd;
		
		for (int i = 0; i < testCase; i++) {
			sortStart = 0;
			sortEnd = 0;
			
			intCount = scanner.nextInt();
			
			int[] arrayBeforeSort = new int[intCount];
			int[] arrayAfterSort = new int[intCount];
			
			// Set arrayBeforeSort
			for (int j = 0; j < intCount; j++) {
				arrayBeforeSort[j] = scanner.nextInt();
			}
			
			// Set arrayAfterSort
			for (int j = 0; j < intCount; j++) {
				arrayAfterSort[j] = scanner.nextInt();
			}
			
			// Get sortStart
			for (int j = 0; j < intCount; j++) {
				if (sortStart == 0 && arrayBeforeSort[j] != arrayAfterSort[j]) {
					sortStart = j;
				}
			}
			
			// Get sortEnd
			for (int j = intCount-1; j >= 0; j--) {
				if (sortEnd == 0 && arrayBeforeSort[j] != arrayAfterSort[j]) {
					sortEnd = j;
				}
			}
			
			// exception case sortStart
			for (int j = sortStart; j > 0; j--) {
				if (arrayAfterSort[j] >= arrayAfterSort[j-1]) {
					sortStart--;
				} else {
					break;
				}
			}
			
			// exception case sortEnd
			for (int j = sortEnd; j < intCount-1; j++) {
				if (arrayAfterSort[j] <= arrayAfterSort[j+1]) {
					sortEnd++;
				} else {
					break;
				}
			}
			
			System.out.println((sortStart+1) + " " + (sortEnd+1));
		}
		
	}

}
