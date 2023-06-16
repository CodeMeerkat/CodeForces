import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/978/B">File Name</a>
 * @author codemeerkat
 */

public class FileName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String input = scanner.next();
		int count = 0;
		
		for (int i = 0; i < n-2; i++) {
			if (input.substring(i, i+3).equals("xxx")) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
