import java.util.ArrayList;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1385/B">Restore the Permutation by Merger</a>
 * @author codemeerkat
 */

public class RestoreThePermutationByMerger {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n, p;
		ArrayList<Integer> arrayList;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			arrayList = new ArrayList<>(n); 
			
			for (int j = 0; j < n * 2; j++) {
				p = scanner.nextInt();
				if (!arrayList.contains(p)) {
					System.out.print(p + " ");
					arrayList.add(p);
				}
			}
			System.out.println();
		}
	}
	
}
