import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1703/B">ICPC Balloons</a>
 * @author codemeerkat
 */

public class ICPCBalloons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int n;
		String s;
		int count;
		
		for (int i = 0; i < testCase; i++) {
			n = scanner.nextInt();
			s = scanner.next();
			count = 0;
			
			for (int j = 0; j < n; j++) {
				if (j == (s.indexOf(s.substring(j, j+1)))) {
					count += 2;
				} else {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
