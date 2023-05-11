import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/32/B">Borze</a>
 * @author codemeerkat
 */

public class Borze {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output = "";
		int index = 0;
		
		// 0 . 
		// 1 -.
		// 2 --
		
		while (index != input.length()) {
			if (input.charAt(index) == '.') {
				output += "0";
				index++;
			} else if (input.substring(index, index+2).equals("-.")) {
				output += "1";
				index += 2;
			} else {
				output += "2";
				index += 2;
			}
		}
		
		System.out.println(output);
	}

}
