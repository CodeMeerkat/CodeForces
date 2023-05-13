import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1512/A">Spy Detected!</a>
 * @author codemeerkat
 */

public class SpyDetected {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int arrayLength;
		int[] array;
		int index;
		
		for (int i = 0; i < testCase; i++) {
			arrayLength = scanner.nextInt();
			array = new int[arrayLength];
			
			for (int j = 0; j < arrayLength; j++) {
				array[j] = scanner.nextInt();
			}
			
			if (array[0] == array[1] && array[1] == array[2]) { // There is answer over index 3
				index = 3;
				while (array[0] == array[index]) {
					index++;
				}
			} else { // There is answer in index 3
				if (array[0] != array[1] && array[1] == array[2]) {
					index = 0;
				} else if (array[0] == array[1] && array[1] != array[2]) {
					index = 2;
				} else {
					index = 1;
				}
			}
			
			System.out.println(index + 1);
		}
		
	}

}
