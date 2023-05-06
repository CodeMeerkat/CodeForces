import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/141/A">Amusing Joke</a>
 * @author codemeerkat
 */

public class AmusingJoke {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine() + scanner.nextLine();
		String ouput = scanner.nextLine();
		
		char[] chars = input.toCharArray();
        Arrays.sort(chars);
        input = new String(chars);
        
        chars = ouput.toCharArray();
        Arrays.sort(chars);
        ouput = new String(chars);
        
        if (input.equals(ouput)) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
	}

}
