import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1822/C">Bun Lover</a>
 * @author codemeerkat
 */

public class BunLover {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		long size;
		long chocolateLength;
		
		// size : 4 - 22 14 04 / 22 + 4 = 26
		// size : 5 - 32 22 05 / 22 + 5*2 = 32 + 5 = 37
		// size : 6 - 44 32 06 / 22 + 5*2 + 6*2 = 44 + 6 = 50
		
		/* Time limit exceeded
		for (int i = 0; i < testCase; i++) {
		size = scanner.nextInt();
		chocolateLength = 22;
		
		if (size == 4) {
			chocolateLength += size;
		} else { // 
			for (int j = 5; j <= size; j++) {
				chocolateLength += (j * 2);
			}
			chocolateLength += size;
		}
		
			System.out.println(chocolateLength);
		}
		*/
		
		// 4  - 5  - 6  - 7  - 8  - 9   - 10
		// 26 - 37 - 50 - 65 - 82 - 101 - 122
		//    11   13   15   17   19    21
		
		// progression of differences
		// bn = 11 + (n-1) * 2 = 2n + 9
		
		// an = 26 + sum_k=1^(n-1) (2n+9) = n^2 + 8n +17
		
		for (int i = 0; i < testCase; i++) {
			size = scanner.nextInt()-3;
			
			chocolateLength = (size * size) + (8 * size) + 17;
			
			System.out.println(chocolateLength);
		}
	}

}
