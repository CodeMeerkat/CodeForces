import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/707/A">Brain's Photos</a>
 * @author codemeerkat
 */

public class BrainsPhotos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		String current;

		boolean isBlackWhite = true;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				current = scanner.next();
				
				if (current.equals("C") || current.equals("M") || current.equals("Y")) {
					isBlackWhite = false;
				}
			}
		}
		
		if (isBlackWhite) {
			System.out.println("#Black&White");
		} else {
			System.out.println("#Color");
		}
	}

}
