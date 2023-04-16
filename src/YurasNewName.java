import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1820/A">Yura's New Name</a>
 * @author codemeerkat
 */

public class YurasNewName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		int testCount = 0;
		
		String input = "";
		int addCount = 0;
		
		boolean isReturned = false;
		while (testCase != testCount) {
			addCount = 0;
			input = scanner.nextLine();
			
			// Check single char
			if (input.equals("^")) {
				input = "^" + input;
				addCount++;
			}
			
			// Check first char
			if(input.charAt(0) == '_') {
				input = "^" + input;
				addCount++;
			}
			
			// Check last char
			if (input.charAt(input.length()-1) == '_') {
				input = input + "^";
				addCount++;
			}
			
			// the other case
			for (int i=input.length()-2; i!=0; i--) {
				if(isReturned == true) {
					i = input.length()-2;
					isReturned = false;
				}
				
				if ((input.charAt(i)=='_') && !((input.charAt(i-1) == '^') && (input.charAt(i+1) == '^'))) {
					input = input.substring(0, i) + "^" + input.substring(i);
					
					addCount++;
					isReturned = true;
				}
			}
			
			System.out.println(addCount);
			testCount++;
		}
	}
}
