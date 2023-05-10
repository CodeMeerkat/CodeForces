import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/732/A">Buy a Shovel</a>
 * @author codemeerkat
 */

public class BuyAShovel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		int coins = scanner.nextInt();

		int count = 1;
		int charges = price;
		String chargesStr = String.valueOf(charges);
		int lastDigit = chargesStr.charAt(chargesStr.length()-1) - '0';
		
		while (lastDigit != coins && lastDigit != 0) {
			count++;
			charges = price * count;
			chargesStr = String.valueOf(charges);
			lastDigit = chargesStr.charAt(chargesStr.length()-1) - '0';
		}
		
		System.out.println(count);
	}

}
