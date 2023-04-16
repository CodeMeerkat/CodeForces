import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/231/A">Team</a>
 * @author codemeerkat
 */

public class Team {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int problemCount = Integer.parseInt(scanner.nextLine());
		String lineInput;
		int solutionCount = 0;
		int totalSolutionCount = 0;
		
		while (problemCount != 0) {
			solutionCount = 0;
			lineInput = scanner.nextLine();
			
			for (int i=0; i < lineInput.length(); i++) {
				if(lineInput.charAt(i) == '1') {
					solutionCount++;
				}
			}
			
			if (solutionCount > 1) {
				totalSolutionCount++;
			}
			
			problemCount--;
		}
		
		System.out.println(totalSolutionCount);
		
	}
}
