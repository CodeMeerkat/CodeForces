import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1360/B">Honest Coach</a>
 * @author codemeerkat
 */

public class HonestCoach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int[] sArray;
		int minimumValue;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			sArray = new int[n];
			minimumValue = 1000;
			
			for (int j = 0; j < n; j++) {
				sArray[j] = scanner.nextInt();
			}
			
			Arrays.sort(sArray);
			
			for (int j = 0; j < n-1; j++) {
				if (sArray[j+1] - sArray[j] < minimumValue) {
					minimumValue = sArray[j+1] - sArray[j];
				}
			}
			
			System.out.println(minimumValue);
		}
	}

}
