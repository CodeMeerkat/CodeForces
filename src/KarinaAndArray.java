import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1822/problem/B">Karina and Array</a>
 * @author codemeerkat
 */

public class KarinaAndArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int arrayLength;
		
		long currentValue;
		long firstBiggest;
		long secondBiggest;
		long firstSmallest;
		long secondSmallest;
		
		for (int i = 0; i < testCase; i++) {
			arrayLength = scanner.nextInt();
			
			// first index
			firstBiggest = secondBiggest = firstSmallest = secondSmallest = scanner.nextInt();
			
			// second index
			currentValue = scanner.nextInt();
			if (currentValue > firstBiggest) {
				firstBiggest = secondSmallest = currentValue;
			} else if(currentValue < firstBiggest) {
				secondBiggest = firstSmallest = currentValue;
			}
			
			// the other indices
			for (int j = 2; j < arrayLength; j++) {
				currentValue = scanner.nextInt();
				
				// set big values
				if (currentValue > firstBiggest && currentValue > secondBiggest) {
					secondBiggest = firstBiggest;
					firstBiggest = currentValue;
				} else if (firstBiggest >= currentValue && currentValue > secondBiggest) {
					secondBiggest = currentValue;
				}
				
				// set small values
				if (currentValue < firstSmallest && currentValue < secondSmallest) {
					secondSmallest = firstSmallest;
					firstSmallest = currentValue;
				} else if (firstSmallest <= currentValue && currentValue < secondSmallest) {
					secondSmallest = currentValue;
				}
			}
			
			if ((firstBiggest * secondBiggest) >= (firstSmallest * secondSmallest)) {
				System.out.println(firstBiggest * secondBiggest);
			} else {
				System.out.println(firstSmallest * secondSmallest);
			}
		}
	}

}
