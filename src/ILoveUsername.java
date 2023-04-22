import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/155/A">I_love_%username%</a>
 * @author codemeerkat
 */

public class ILoveUsername {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int amazingCount = 0;
		
		int currentNum = scanner.nextInt();
		int maximumNum = currentNum;
		int minimumNum = currentNum;
		
		for (int i = 0; i < count-1; i++) {
			currentNum = scanner.nextInt();
			
			if (currentNum > maximumNum) {
				maximumNum = currentNum;
				amazingCount++;
			}
			
			if (currentNum < minimumNum) {
				minimumNum = currentNum;
				amazingCount++;
			}
		}
		
		System.out.println(amazingCount);
	}

}
