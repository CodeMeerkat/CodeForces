import java.util.ArrayList;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1833/problem/B">Restore the Weather</a>
 * @author codemeerkat
 */

//Time limit exceeded on test
public class RestoreTheWeather {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n, k;
		int[] aArray;
		int[] bArray;
		int[] aOrderArray;
		int[] bOrderArray;
		ArrayList<Integer> list;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			k = scanner.nextInt(); // Don't use
			
			aArray = new int[n];
			bArray = new int[n];
			aOrderArray = new int[n];
			bOrderArray = new int[n];
			list = new ArrayList<Integer>(n);
			
			for (int j = 0; j < n; j++) {
				aOrderArray[j] = 1;
				bOrderArray[j] = 1;
				list.add(j, -1);
			}
			
			for (int j = 0; j < n; j++) {
				aArray[j] = scanner.nextInt();
				
				for (int l = 0; l < j; l++) {
					if (aArray[j] >= aArray[l]) {
						aOrderArray[j]++;
					} else {
						aOrderArray[l]++;
					}
				}
			}
			
			for (int j = 0; j < n; j++) {
				bArray[j] = scanner.nextInt();

				for (int l = 0; l < j; l++) {
					if (bArray[j] >= bArray[l]) {
						bOrderArray[j]++;
					} else {
						bOrderArray[l]++;
					}
				}
			}
			
			for (int j = 0; j < n; j++) {
				list.set(bOrderArray[j]-1, bArray[j]);
			}

			for (int j = 0; j < n; j++) {
				System.out.print(list.get(aOrderArray[j] - 1) + " ");
			}
			
			System.out.println();
		}
	}

}
