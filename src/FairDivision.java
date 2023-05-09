import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1472/B">Fair Division</a>
 * @author codemeerkat
 */

public class FairDivision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int candyNum;
		
		int weight1Count;
		int weight2Count;
		
		for (int i = 0; i < testCase; i++) {
			candyNum = scanner.nextInt();
			weight1Count = 0;
			weight2Count = 0;
			
			for (int j = 0; j < candyNum; j++) {
				if (scanner.nextInt() == 1) {
					weight1Count++;
				} else {
					weight2Count++;
				}
			}
			
			if ((weight1Count % 2 == 0) && (weight2Count % 2 == 0)) {
				System.out.println("YES");
			} else if ((weight1Count % 2 == 0) && (weight1Count != 0) && (weight2Count % 2 == 1)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
