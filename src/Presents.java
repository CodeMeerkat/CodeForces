import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/136/A">Presents</a>
 * @author codemeerkat
 */

public class Presents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberFriends = scanner.nextInt();
		int[] array = new int[numberFriends];
		
		for (int i = 1; i <= numberFriends; i++) {
			array[scanner.nextInt()-1] = i;
		}

		for(int num : array) {
			System.out.print(num + " ");
		}
			
	}

}
