import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/116/A">Tram</a>
 * @author codemeerkat
 */

public class Tram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int stops = scanner.nextInt();
		int maxCapacity = 0;
		int capacity = 0;
		int enterCount;
		int exitCount;
		
		for (int i = 0; i < stops; i++) {
			exitCount = scanner.nextInt();
			enterCount = scanner.nextInt();
			
			capacity += (enterCount - exitCount);
			
			if (capacity > maxCapacity) {
				maxCapacity = capacity;
			}
		}
		
		System.out.println(maxCapacity);
	}

}
