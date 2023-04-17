import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/266/A">Stones on the Table</a>
 * @author codemeerkat
 */

public class StonesOnTheTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numStones = Integer.parseInt(scanner.nextLine());
		String stones = scanner.nextLine();
		int count = 0;
		String currentStone;
		String rightStone;
		
		if (numStones > 1) {
			for (int i = 0; i < numStones-1; i++) {
				currentStone = stones.substring(i, i+1);
				
				rightStone =  stones.substring(i+1, i+2);
				
				if (currentStone.equals(rightStone)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
