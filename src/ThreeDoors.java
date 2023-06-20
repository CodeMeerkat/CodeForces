import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href=https://codeforces.com/problemset/problem/1709/A">Three Doors</a>
 * @author codemeerkat
 */

public class ThreeDoors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int keyInHand;
		int[] keyInRoom;
		ArrayList<Integer> opendRoom;
		
		for (int i = 0; i < testCase; i++) {
			keyInHand = scanner.nextInt() - 1;
			keyInRoom = new int[3];
			opendRoom = new ArrayList<>(Arrays.asList(0, 0, 0));
			
			for (int j = 0; j < 3; j++) {
				keyInRoom[j] = scanner.nextInt() - 1;
			}
			
			for (int j = 0; j < 3; j++) {
				if (keyInHand == -1) {
					break;
				}
				opendRoom.set(keyInHand, 1);
				keyInHand = keyInRoom[keyInHand];
			}
			
			if (opendRoom.contains(0)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

}
