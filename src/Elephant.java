import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/617/A">Elephant</a>
 * @author codemeerkat
 */

public class Elephant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coordinate = scanner.nextInt();
		int steps = 0;

		if (coordinate % 5 == 0) {
			steps = coordinate / 5;
		} else {
			steps = (coordinate / 5) + 1;
		}
		
		System.out.println(steps);
	}

}
