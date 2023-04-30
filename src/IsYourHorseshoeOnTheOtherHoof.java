import java.util.ArrayList;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/228/A">Is your horseshoe on the other hoof?</a>
 * @author codemeerkat
 */

public class IsYourHorseshoeOnTheOtherHoof {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> reusltArrayList = new ArrayList<Integer>();
		int count = 0;
		int current;
		
		for (int i = 0; i < 4; i++) {
			current = scanner.nextInt();
			if (reusltArrayList.contains(current)) {
				count++;
			} else {
				reusltArrayList.add(current);
			}
		}
		
		System.out.println(count);
	}

}
