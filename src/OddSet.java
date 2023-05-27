import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1542/A">Odd Set</a>
 * @author codemeerkat
 */

public class OddSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int setNum;
		int oddCount;
		int evenCount;
		
		for (int i = 0; i < testCase; i++) {
			setNum = scanner.nextInt();
			oddCount = 0;
			evenCount = 0;
			
			for (int j = 0; j < setNum*2; j++) {
				if (scanner.nextInt() % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
			
			if (evenCount == oddCount) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
