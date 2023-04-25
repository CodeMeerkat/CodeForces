import java.util.Scanner;

/**
 * See <a href="https://codeforces.com/contest/1822/problem/A">TubeTube Feed</a>
 * @author codemeerkat
 */

public class TubeTubeFeed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		int numVideo;
		int capableTime;
		int[] durationsVideoArray; 
		int[] entertainmentValueArray; 
				
		int highestEntertainmentValue;
		int bestIndex;
		
		for (int i = 0; i < testCase; i++) {
			numVideo = scanner.nextInt();
			capableTime = scanner.nextInt();
			bestIndex = -1;
			highestEntertainmentValue = 0;
			
			durationsVideoArray = new int[numVideo];
			entertainmentValueArray = new int[numVideo];
			
			for (int j = 0; j < numVideo; j++) {
				durationsVideoArray[j] = scanner.nextInt();
			}
			
			for (int j = 0; j < numVideo; j++) {
				entertainmentValueArray[j] = scanner.nextInt();
			}
			
			for (int j = 0; j < numVideo; j++) {
				if (capableTime < 1) {
					break;
				}
				
				if (durationsVideoArray[j] <= capableTime) {
					if (entertainmentValueArray[j] > highestEntertainmentValue) {
						highestEntertainmentValue = entertainmentValueArray[j];
						bestIndex = j;
					}
				}
				capableTime--;
			}
			
			if (bestIndex != -1) {
				bestIndex++;
			}
			
			System.out.println(bestIndex);
		}
		
	}

}
