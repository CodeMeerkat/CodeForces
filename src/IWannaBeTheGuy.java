import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/469/A">I Wanna Be the Guy</a>
 * @author codemeerkat
 */

public class IWannaBeTheGuy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gameLevel = scanner.nextInt();
		List<Integer> levelList = new ArrayList<Integer>();
		int userXCount = 0;
		int userYCount = 0;
		
		// set level list
		for (int i=1; i <= gameLevel; i++) {
			levelList.add(i);
		}
		
		// user X
		userXCount = scanner.nextInt();
		
		for (int i = 0; i < userXCount; i++) {
			levelList = removeClearableLv(levelList, scanner);
		}
		
		// user Y
		userYCount = scanner.nextInt();
		
		for (int i = 0; i < userYCount; i++) {
			levelList = removeClearableLv(levelList, scanner);
		}
		
		if (levelList.isEmpty()) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
		
	}
	
	static List<Integer> removeClearableLv(List<Integer> levelList, Scanner sc) {
		int currentLevel = sc.nextInt();
		if (levelList.contains(currentLevel)) {
			levelList.remove(Integer.valueOf(currentLevel));
		}
		
		return levelList;
	}

}
