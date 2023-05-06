import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/144/A">Arrival of the General</a>
 * @author codemeerkat
 */

public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soldiersNum = scanner.nextInt();
		int maximum, minimum;
		int maximumIndex = 0;
		int minimumIndex = 0;
		int currentNum;
		
		maximum = minimum = scanner.nextInt();
		
		for (int index = 1; index < soldiersNum; index++) {
			currentNum = scanner.nextInt();
			
			if (currentNum > maximum) {
				maximum = currentNum;
				maximumIndex = index;
			}
			
			if (currentNum <= minimum) {
				minimum = currentNum;
				minimumIndex = index;
			}
		}

		if (maximumIndex > minimumIndex) {
			System.out.println((maximumIndex) + (soldiersNum-1-minimumIndex) - 1);
		} else {
			System.out.println((maximumIndex) + (soldiersNum-1-minimumIndex));
		}
	}

}
