import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/282/A">Bit++</a>
 * @author codemeerkat
 */

public class BitPP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startNum = Integer.parseInt(scanner.nextLine());
		int count = startNum;
		int endNum = 0;
		String operation = "";
		
		for (int i = 0; i < count; i++) {
			operation = scanner.nextLine();
			
			if (operation.contains("++")) {
				endNum++;
			} else {
				endNum--;
			}
		}
		
		System.out.println(endNum);
	}
	
}
