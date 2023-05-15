import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1828/problem/A">Divisible Array</a>
 * @author codemeerkat
 */

public class DivisibleArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int firstValue;
		
		int[] resultArray;
		boolean isClear;
		int sum;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			isClear = false;
			firstValue = 1000;
			
			resultArray = new int[n];
			sum = 0;
			
			for (int index = 1; index < n; index++) {
				resultArray[index] = index + 1;
				sum += index + 1;
			}

			while (!isClear) {
				if ((sum + firstValue) % n == 0) {
					isClear = true;
					resultArray[0] = firstValue;
				} else {
					firstValue--;
				}
			}
			
			for (int index = 0; index < n; index++) {
				System.out.print(resultArray[index] + " ");
			}
			System.out.println();
		}
	}

}
