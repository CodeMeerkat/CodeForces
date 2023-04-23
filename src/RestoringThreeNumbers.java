import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1154/A">Restoring Three Numbers</a>
 * @author codemeerkat
 */

public class RestoringThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] inputArray = new int[4];
		int a;
		int b;
		int c;
		int sumABC;
		
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(inputArray);
		
		sumABC = inputArray[3];
		a = sumABC - inputArray[0];
		b = sumABC - inputArray[1];
		c = sumABC - inputArray[2];
		
		System.out.println(a + " " + b + " " + c);
		
	}

}
