import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/432/A">Choosing Teams</a>
 * @author codemeerkat
 */

public class ChoosingTeams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int students = scanner.nextInt();
		int minimumTimes = scanner.nextInt();
		int[] array = new int[students];
		int count = 0;
		
		for (int i = 0; i < students; i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.sort(array);
		
		for (int i = 0; i < (students/3) ; i++) {
			if ((array[i * 3] + minimumTimes <= 5) && (array[i * 3 + 1] + minimumTimes <= 5) && (array[i * 3 + 2] + minimumTimes <= 5)) {
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(count);
	}
}
