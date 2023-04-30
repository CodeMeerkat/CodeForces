import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1818/problem/A">Politics</a>
 * @author codemeerkat
 */

public class Politics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int numberMember;
		int numberdiscussions;
		String myOpinion;
		
		int result;
		
		for (int i = 0; i < testCase; i++) {
			numberMember = scanner.nextInt();
			numberdiscussions = scanner.nextInt();

			result = 1;
			myOpinion = scanner.next();
			
			for (int j = 1; j < numberMember; j++) {
				if (myOpinion.equals(scanner.next())) {
					result++;
				}
			}
			
			System.out.println(result);
		}
	}

}
