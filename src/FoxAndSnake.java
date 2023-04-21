import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/510/A">Fox And Snake</a>
 * @author codemeerkat
 */

public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rowCount = scanner.nextInt();
		int colCount = scanner.nextInt();
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				if (i%2 == 1) { // odd row
					System.out.print("#");
				} else { // even row
					if (i%4 == 0 && j == 1) {
						System.out.print("#");
					} else if (i%4 != 0 && j == colCount) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}

}
