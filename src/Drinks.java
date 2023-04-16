import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/200/B">Drinks</a>
 * @author codemeerkat
 */

public class Drinks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOrange = Integer.parseInt(scanner.nextLine());
		int count = numOrange;
		double volumeFraction = 0;
		
		for (int i = 0; i < count; i++) {
			volumeFraction += scanner.nextInt();
		}
		
		System.out.println(volumeFraction / numOrange);
	}

}
