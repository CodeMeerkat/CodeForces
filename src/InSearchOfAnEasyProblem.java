import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1030/A">In Search of an Easy Problem</a>
 * @author codemeerkat
 */

public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberPeople = scanner.nextInt();
		String result = "EASY";
		
		for (int i = 0; i < numberPeople; i++) {
			if (scanner.nextInt() == 1) {
				result = "HARD";
			}
		}
		
		System.out.println(result);
	}

}
