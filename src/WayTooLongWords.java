import java.util.Scanner;

/**
 * See <a href="http://codeforces.com/problemset/problem/71/A">WayTooLongWords</a>
 * @author codemeerkat
 */

public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		String letter;
		
		while (count != 0) {
			letter = scanner.nextLine();
			int length = letter.length();
			
			if(length > 10) {
				System.out.println(Character.toString(letter.charAt(0)) + (length -2) + letter.charAt(length-1));
			} else {
				System.out.println(letter);
			}
			
			count--;
		}
	}
}
