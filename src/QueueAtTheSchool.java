import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/266/B">Queue at the School</a>
 * @author codemeerkat
 */

public class QueueAtTheSchool {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int time = scanner.nextInt();
		String arrangement = scanner.next();
		
		char[] charArray = new char[number];
		
		for (int i = 0; i < number; i++) {
			charArray[i] = arrangement.charAt(i);
		}
			
		for (int i = 0; i < time; i++) {
			for (int j = 0 ; j < number-1; j++) {
				if (charArray[j] == 'B' && charArray[j+1] == 'G') {
					charArray[j] = 'G';
					charArray[j+1] = 'B';
					j++;
				}
			}
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print(charArray[i]);
		}
	}

}
