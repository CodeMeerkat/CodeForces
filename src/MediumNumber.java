import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1760/A">Medium Number</a>
 * @author codemeerkat
 */

public class MediumNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		int[] array = new int[3];
		
		for (int i = 0; i < testCount; i++) {
			array[0] = scanner.nextInt();
			array[1] = scanner.nextInt();
			array[2] = scanner.nextInt();
			
			Arrays.sort(array);
			
			System.out.println(array[1]);
		}
	}

}
