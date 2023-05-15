import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/749/A">Bachgold Problem</a>
 * @author codemeerkat
 */

public class BachgoldProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int maxPossiblePrime = input / 2;

		System.out.println(maxPossiblePrime);
		
		if (input % 2 != 0) {
			System.out.print("3 ");
			input -= 3;
		}
		
		while (input > 0) {
			System.out.print("2 ");
			input -= 2;
		}
	}

}
