import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/705/A">Hulk</a>
 * @author codemeerkat
 */

public class Hulk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int layer = scanner.nextInt();
		String output = "I hate it";
		
		for (int i = 2; i <= layer; i++) {
			if (i % 2 == 0) { // even
				output = output.replace("it", "that I love it");
			} else { // odd
				output = output.replace("it", "that I hate it");
			}
		}

		System.out.println(output);
	}

}
