import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1624/A">Plus One on the Subset</a>
 * @author codemeerkat
 */

public class PlusOneOnTheSubset {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int biggestNum;
		int smallestNum;
		int currentNum;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			
			biggestNum = scanner.nextInt();
			smallestNum = biggestNum;
			
			
			for (int j = 1; j < n; j++) {
				currentNum = scanner.nextInt();
				
				if (currentNum > biggestNum) {
					biggestNum = currentNum;
				}
				
				if (currentNum < smallestNum) {
					smallestNum = currentNum;
				}
			}
			
			System.out.println(biggestNum - smallestNum);
			
		}
	}

}
