import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/996/A">Hit the Lottery</a>
 * @author codemeerkat
 */

public class HitTheLottery {

	static int input = 0;
	static int resultCount = 0;
	static int[] denominations = {100, 20, 10, 5, 1};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		for (int i = 0; i < denominations.length; i++) {
			calculate(denominations[i]);
		}
		
		System.out.println(resultCount);
	}
	
	static void calculate(int denomination) {
		if (input >= denomination) {
			resultCount += input/denomination;
			input %= denomination;
		}
	}

}
