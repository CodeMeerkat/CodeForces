import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/344/A">Magnets</a>
 * @author codemeerkat
 */

public class Magnets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int magnetsCount = scanner.nextInt();
		int resultCount = 1;

		String currentMagnet = scanner.next();
		String nextMagnet = "";
		
		for (int i = 1; i < magnetsCount; i++) {
			nextMagnet = scanner.next();
			
			if (!currentMagnet.equals(nextMagnet)) {
				resultCount++;
			}
			
			currentMagnet = nextMagnet;
		}
		
		System.out.println(resultCount);
	}

}
