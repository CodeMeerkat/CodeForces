import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1607/A">Linear Keyboard</a>
 * @author codemeerkat
 */

public class LinearKeyboard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String keyboard;
		String s;
		int typeCounter;
		
		for (int i = 0; i < testCase; i++) {
			keyboard = scanner.next();
			s = scanner.next();
			typeCounter = 0;
			
			for (int j = 0; j < s.length()-1; j++) {
				typeCounter += (Math.abs(keyboard.indexOf(s.charAt(j)) - keyboard.indexOf(s.charAt(j+1))));
			}
			
			System.out.println(typeCounter);
		}
	}

}
