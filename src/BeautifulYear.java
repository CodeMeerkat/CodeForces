import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/271/A">Beautiful Year</a>
 * @author codemeerkat
 */

public class BeautifulYear {

	static String currentStr;
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int output = input;
		boolean isDistinct = false;
		
		while (!isDistinct) {
			output++;
			currentStr = Integer.toString(output);
			
			if (checkDistinct(0) && checkDistinct(1) && checkDistinct(2) && checkDistinct(3)) {
				isDistinct = true;
			}
		}
		System.out.println(output);
	}

	static boolean checkDistinct (int index) {
		if (currentStr.indexOf(currentStr.charAt(index)) == index) {
			return true;
		} else {
			return false;
		}
	}
}
