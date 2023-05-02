import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/1560/A">Dislike of Threes</a>
 * @author codemeerkat
 */

public class DislikeOfThrees {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();

		int inputIndex;
		
		int value = 1;
		String valueStr = String.valueOf(value);
		
		int[] array = new int[1001];
		for (int index = 0; index <= 1000; ) {
			if ((value % 3 != 0) && (valueStr.charAt(valueStr.length()-1) != '3')) {
				array[index] = value;
				index++;
			}
			
			value++;
			valueStr = String.valueOf(value);
		}

		for (int i = 0; i < testCase; i++) {
			inputIndex = scanner.nextInt();
			
			System.out.println(array[inputIndex-1]);
		}
	}

}
