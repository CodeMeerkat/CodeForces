import java.math.BigDecimal;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1555/A">PizzaForces</a>
 * @author codemeerkat
 */

public class PizzaForces {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		long friendsNum;
		long slices;

		// If you are not using BigDecimal, few of last digit number are wrong
		BigDecimal sliceBigDecima;
		BigDecimal timeBigDecimal = new BigDecimal("2.5");
		
		for (int i = 0; i < testCase; i++) {
			friendsNum = scanner.nextLong();
			slices = friendsNum;

			sliceBigDecima = BigDecimal.valueOf(slices);
			
			if (slices < 6) {
				slices = 6;
				System.out.println(15);
			} else {
				if (slices % 2 != 0) {
					sliceBigDecima = sliceBigDecima.add(BigDecimal.ONE);
				}
				
				System.out.println(String.format("%.0f", sliceBigDecima.multiply(timeBigDecimal)));
			}
		}
	}

}
