import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/581/A">Vasya the Hipster</a>
 * @author codemeerkat
 */

public class VasyaTheHipster {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int redSocks = scanner.nextInt();
		int blueSocks = scanner.nextInt();
		
		if (redSocks > blueSocks) {
			redSocks -= blueSocks;
			System.out.println(blueSocks + " " + redSocks/2);
		} else if (redSocks < blueSocks) {
			blueSocks -= redSocks;
			System.out.println(redSocks + " " + blueSocks/2);
		} else { // redSocks == blueSocks
			System.out.println(redSocks + " 0");
		}
	}

}
