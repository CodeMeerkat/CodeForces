import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/339/A">Helpful Maths</a>
 * @author codemeerkat
 */

public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int numCount = (input.length() + 1)/2;
		
		int[] array = new int[numCount];
		
		for (int i = 0; i < numCount; i++) {
			array[i] = Integer.parseInt(input.substring(2*i, 2*i+1));
		}

		Arrays.sort(array);

		System.out.print(array[0]);
		
		if (numCount > 1) {
			for (int i = 1; i < numCount; i++) {
				System.out.print("+" + array[i]);
			}
		}
	}

}
