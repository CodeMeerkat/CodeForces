import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1821/problem/A">Matching</a>
 * @author codemeerkat
 */

public class Matching {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String inputString = "";
		int caseCount;
		
		for (int i = 0 ; i < testCase; i++) {
			inputString = scanner.next();
			caseCount  = 1;
			
			if (inputString.charAt(0) == '0') { // first ditit is 0
				System.out.println("0");
			} else { // Case included question mark
				if (inputString.contains("?")) {
					for (int j = 0; j < inputString.length(); j++) {
						if (inputString.charAt(j) == '?') { 
							if (j == 0) { // first digit is ?
								caseCount *= 9;
							} else { // the other digits is ?
								caseCount *= 10;
							}
						}
					}
					System.out.println(caseCount);
				} else { // Case only number
					System.out.println("1");
				}
			}
		}
	}

}
