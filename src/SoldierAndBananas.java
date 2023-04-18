import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/546/A">Soldier and Bananas</a>
 * @author codemeerkat
 */

public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int costFirst = scanner.nextInt();
		int money = scanner.nextInt();
		int count = scanner.nextInt();
		int borrowedMoney = 0;
		int fee = 0;
		
		for (int i = 1; i <= count; i++) {
			fee += (costFirst * i);
		}
		
		if (money < fee) {
			borrowedMoney = fee - money;
		}
		
		System.out.println(borrowedMoney);
	}

}
