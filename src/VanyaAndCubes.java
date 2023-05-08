import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/492/A">Vanya and Cubes</a>
 * @author codemeerkat
 */

public class VanyaAndCubes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int height = 0;
		int plus = 0;
		int sum = 0;
		
		while (true) {
			height++;
			plus = height * (height+1) / 2;
			
			sum += plus;
			
			if (sum > input) {
				height--;
				break;
			}
		}
		
		System.out.println(height);
	}

}
