import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/427/A">Police Recruits</a>
 * @author codemeerkat
 */

public class PoliceRecruits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int event = scanner.nextInt();
		int manPower = 0;
		int untreatedCrimes = 0;
		int currentEvent = 0;
		
		for (int i = 0; i < event; i++) {
			currentEvent = scanner.nextInt();
			
			if (currentEvent > 0) {
				manPower += currentEvent;
			} else {
				if (manPower == 0) {
					untreatedCrimes++;
				} else {
					manPower += currentEvent;
				}
			}
		}
		
		System.out.println(untreatedCrimes);
	}

}
