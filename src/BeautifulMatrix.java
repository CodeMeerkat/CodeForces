import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/263/A">BeautifulMatrix</a>
 * @author codemeerkat
 */

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentRow = 0;
		int currentCol = 0;
		int targetRow = 2;
		int targetCol = 2;
		
		boolean isFind = false;
		int count = 0;
		
		while(!isFind) {
			if (scanner.nextInt() == 1) {
				isFind = true;
				break;
			}
			count++;
		}
		
		currentRow = count/5;
		currentCol = count%5;
		
		System.out.println(Math.abs(targetRow-currentRow) + Math.abs(targetCol-currentCol));
	}
}
