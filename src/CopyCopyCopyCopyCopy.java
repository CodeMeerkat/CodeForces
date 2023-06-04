import java.util.Arrays;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1325/B">CopyCopyCopyCopyCopy</a>
 * @author codemeerkat
 */


public class CopyCopyCopyCopyCopy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		int[] aArray;
		int count;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			aArray = new int[n];
			count = 1;
			
			for (int j = 0; j < n; j++) {
				aArray[j] = scanner.nextInt();
			}
			
			Arrays.sort(aArray);
			
			for (int j = 1; j < n; j++) {
				if (aArray[j-1] != aArray[j]) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
