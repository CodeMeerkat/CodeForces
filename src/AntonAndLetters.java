import java.util.ArrayList;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/443/A">Anton and Letters</a>
 * @author codemeerkat
 */

public class AntonAndLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String array = scanner.nextLine().replaceAll(" ", "");
		
		String currentLetter = "";
		ArrayList<String> distinctArray = new ArrayList<String>();;
		
		if (array.length() != 2) {
			for (int i = 1 ; i <= array.length()/2; i++) {
				currentLetter = String.valueOf(array.charAt(i * 2 - 1));
				
				if (!distinctArray.contains(currentLetter)) {
					distinctArray.add(currentLetter);
				}
			}

			System.out.println(distinctArray.size());
		
		} else {
			System.out.println(0);
		}

		
	}

}
