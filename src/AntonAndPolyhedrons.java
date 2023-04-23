import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/785/A">Anton and Polyhedrons</a>
 * @author codemeerkat
 */

public class AntonAndPolyhedrons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int result = 0;
		String input = "";
		
		for (int i = 0; i < testCase; i++) {
			input = scanner.next();
			
			if (input.equals("Tetrahedron")) {
				result += 4;
			} else if (input.equals("Cube")) {
				result += 6;
			} else if (input.equals("Octahedron")) {
				result += 8;
			} else if (input.equals("Dodecahedron")) {
				result += 12;
			} else if (input.equals("Icosahedron")) {
				result += 20;
			}
		}
		
		System.out.println(result);
	}

}
