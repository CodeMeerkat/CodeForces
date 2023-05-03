import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/381/A">Sereja and Dima</a>
 * @author codemeerkat
 */

public class SerejaAndDima {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cardNumber = scanner.nextInt();
		int[] cardArray = new int[cardNumber];
		
		int leftIndex = 0;
		int rightIndex = cardNumber - 1;
		
		int serejaPoint = 0;
		int dimaPoint = 0;
		
		boolean isSerejaTurn = true;
		
		for (int i = 0; i < cardNumber; i++) {
			cardArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < cardNumber; i++) {
			if (cardArray[leftIndex] > cardArray[rightIndex]) {
				if (isSerejaTurn) {
					serejaPoint += cardArray[leftIndex];
				} else {
					dimaPoint += cardArray[leftIndex];
				}
				leftIndex++;
			} else {
				if (isSerejaTurn) {
					serejaPoint += cardArray[rightIndex];
				} else {
					dimaPoint += cardArray[rightIndex];
				}
				rightIndex--;
			}
			
			if (isSerejaTurn) {
				isSerejaTurn = false;
			} else {
				isSerejaTurn = true;
			}
		}
		
		System.out.println(serejaPoint + " " + dimaPoint);
	}

}
