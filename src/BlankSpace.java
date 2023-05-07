import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1829/problem/B">Blank Space</a>
 * @author codemeerkat
 */

public class BlankSpace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int arrayLength;
		
		int longestCount;
		int count;
		
		for (int i = 0; i < testCase; i++) {
			arrayLength = scanner.nextInt();
			longestCount = 0;
			count = 0;
			
			for (int j = 0; j < arrayLength; j++) {
				if (scanner.nextInt() == 0) {
					count++;
				} else {
					if (count > longestCount) {
						longestCount = count;
					}
					
					count = 0;
				}
			}
			
			if (count > longestCount) {
				longestCount = count;
			}
			
			System.out.println(longestCount);
		}
	}

}
