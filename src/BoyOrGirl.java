import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/236/A">Boy or Girl</a>
 * @author codemeerkat
 */

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();		
		String output = "";
		String targetChar;
		
		for (int i = 0; i < input.length(); i++) {
			targetChar = input.substring(i, i+1);
			
			if(!output.contains(targetChar)) {
				output += String.valueOf(input.charAt(i));
			}
		}
		if (output.length()%2 != 0) {		// male
			System.out.println("IGNORE HIM!");
		} else {							// female
			System.out.println("CHAT WITH HER!");
		}
	
	}

}
