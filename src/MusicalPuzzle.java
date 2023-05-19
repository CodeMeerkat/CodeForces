import java.util.ArrayList;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1833/problem/A">Musical Puzzle</a>
 * @author codemeerkat
 */

public class MusicalPuzzle {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		String input;
		int inputLength;
		int count;
		ArrayList<String> inputArrayList;
		String currentStr;
		
		for (int i = 0; i < testCase; i++) {
			inputLength = scanner.nextInt();
			input = scanner.next();
			count = 0;
			
			inputArrayList = new ArrayList<String>();
			
			for (int j = 0; j < inputLength-1; j++) {
				currentStr = input.substring(j, j+2);
				
				if (!inputArrayList.contains(currentStr)) {
					inputArrayList.add(currentStr);
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
	
}
