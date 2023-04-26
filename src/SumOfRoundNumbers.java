import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1352/A">Sum of Round Numbers</a>
 * @author codemeerkat
 */

public class SumOfRoundNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int input;
		List<Integer> resultList = new ArrayList<Integer>();
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.nextInt();
			
			if (input < 10 || input == 10000) {
				System.out.println(1);
				System.out.println(input);
			} else {
				resultList.clear();
				
				if (input / 1000 > 0) {
					resultList.add(input / 1000 * 1000);
					input -= (input / 1000 * 1000);
				}
				
				if (input / 100 > 0) {
					resultList.add(input / 100 * 100);
					input -= (input / 100 * 100);
				}
				
				if (input / 10 > 0) {
					resultList.add(input / 10 * 10);
					input -= (input / 10 * 10);
				}
				
				if (input > 0) {
					resultList.add(input);
				}
				
				System.out.println(resultList.size());
				
				for(int j = 0; j < resultList.size(); j++) {
					System.out.print(resultList.get(j));
					
					if (j != resultList.size()-1) {
						System.out.print(" ");
					} else {
						System.out.println();
					}
				}
			}
		}
		
	}

}
