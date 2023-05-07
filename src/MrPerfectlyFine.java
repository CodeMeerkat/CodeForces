import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1829/problem/C">Mr. Perfectly Fine</a>
 * @author codemeerkat
 */

public class MrPerfectlyFine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int bookNum;
		
		int minimumXO; // 01
		int minimumOX; // 10
		int minimumOO; // 11
		
		int currentTime;
		String currentStr;
		
		
		for (int i = 0; i < testCase; i++) {
			bookNum = scanner.nextInt();
			
			minimumXO = 0;
			minimumOX = 0;
			minimumOO = 0;
			
			for (int j = 0; j < bookNum; j++) {
				currentTime = scanner.nextInt();
				currentStr = scanner.next();
				
				if (currentStr.equals("01")) {
					if (currentTime < minimumXO || minimumXO == 0) {
						minimumXO = currentTime;
					}
				}
				
				if (currentStr.equals("10")) {
					if (currentTime < minimumOX || minimumOX == 0) {
						minimumOX = currentTime;
					}
				}
				
				if (currentStr.equals("11")) {
					if (currentTime < minimumOO || minimumOO == 0) {
						minimumOO = currentTime;
					}
				}
			}

			if ((minimumOO == 0) && (minimumXO == 0 || minimumOX == 0)) {
				System.out.println(-1);
			} else {
				if (minimumOO == 0) { // 01 10
					System.out.println(minimumXO + minimumOX);
				} else if (minimumXO == 0 || minimumOX == 0) { // 11
					System.out.println(minimumOO);
				} else { // both
					if (minimumOO < (minimumXO + minimumOX)) {
						System.out.println(minimumOO);
					} else {
						System.out.println(minimumXO + minimumOX);
					}
				}
			}
		}
	}

}
