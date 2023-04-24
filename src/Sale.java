import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/34/B">Sale</a>
 * @author codemeerkat
 */

public class Sale {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tvSetCount = scanner.nextInt();
		int carribleAmount = scanner.nextInt();
		int sum = 0;
		
		int[] array = new int[tvSetCount];

		for (int i = 0; i < tvSetCount; i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.sort(array);

		for (int i = 0 ; i < carribleAmount; i++) {
			if (array[i] < 0) {
				sum += (array[i] * -1);
			}
		}
		
		System.out.println(sum);
	}

}
