import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/977/A">Wrong Subtraction</a>
 * @author codemeerkat
 */

public class WrongSubtraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int startNum = scanner.nextInt();
		int count = scanner.nextInt();
		int result = startNum;
		String resultStr = "";
		
		for (int i = 0; i < count; i++) {
			resultStr = Integer.toString(result);
			
			if (resultStr.charAt(resultStr.length()-1) == '0') {
				result = result/10;
			} else {
				result--;
			}
		}
		
		System.out.println(result);
	}

}
