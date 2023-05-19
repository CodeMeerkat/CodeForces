import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/80/A">Panoramix's Prediction</a>
 * @author codemeerkat
 */

public class PanoramixsPrediction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		for (n = n+1; n <= m; n++) {
			if (isPrime(n)) {
				break;
			}
		}
		
		if (n == m) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	static public boolean isPrime(int n) {
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
	      if (n % i == 0) {
	          return false;
	      }
		}
		
		return true;
	}

}
