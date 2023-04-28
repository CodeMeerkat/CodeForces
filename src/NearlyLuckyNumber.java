import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/110/A">Nearly Lucky Number</a>
 * @author codemeerkat
 */

public class NearlyLuckyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int resultCount = 0;
		
		for (int i = 0 ; i < input.length(); i++) {
			if (input.charAt(i) == '7' || input.charAt(i) == '4') {
				resultCount++;
			}
		}
		
		if (resultCount == 7 || resultCount == 4) {
			System.out.println("YES");	
		} else {
			System.out.println("NO");
		}
		
	}

}
