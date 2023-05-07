import java.util.ArrayList;
import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/problemset/problem/490/A">Team Olympiad</a>
 * @author codemeerkat
 */

public class TeamOlympiad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int studentsNum = scanner.nextInt();
		int current;
		int largestTeamCount;
		
		ArrayList<Integer> t1ArrayList = new ArrayList<Integer>();
		ArrayList<Integer> t2ArrayList = new ArrayList<Integer>();
		ArrayList<Integer> t3ArrayList = new ArrayList<Integer>();
		
		for (int i = 1; i <= studentsNum; i++) {
			current = scanner.nextInt();
			
			if (current == 1) {
				t1ArrayList.add(i);
			} else if (current == 2) {
				t2ArrayList.add(i);
			} else { // current == 3
				t3ArrayList.add(i);
			}
		}

		largestTeamCount = Math.min(Math.min(t1ArrayList.size(), t2ArrayList.size()), t3ArrayList.size());
		
		System.out.println(largestTeamCount);
		
		for (int i = 0; i < largestTeamCount; i++) {
			System.out.println(t1ArrayList.get(i) + " " + t2ArrayList.get(i) + " " + t3ArrayList.get(i));
		}
		
	}

}
