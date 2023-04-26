import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/677/A">Vanya and Fence</a>
 * @author codemeerkat
 */

public class VanyaAndFence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int friendCount = scanner.nextInt();
		int fenceHeight = scanner.nextInt();
		int sumWidth = 0;
		
		for (int i = 0; i < friendCount; i++) {
			if (scanner.nextInt() > fenceHeight) {
				sumWidth += 2;
			} else {
				sumWidth++;
			}
		}
		
		System.out.println(sumWidth);
	}

}
