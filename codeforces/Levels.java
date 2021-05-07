import java.util.*;


public class Levels{

	public static void main(String[] args){
		Set<String> passedLevels = new HashSet<String>();
		
		Scanner input = new Scanner(System.in);
		//  all levels input
		int n = input.nextInt();
		
		// X level input
		int p = input.nextInt();
		for(int i = 0; i < p; i++){
			String xLevelNumber = input.next();
			passedLevels.add(xLevelNumber);
		}
		
		// Y level input
		int q = input.nextInt();
		for(int i = 0; i < q; i++){
			String yLevelNumber = input.next();
			passedLevels.add(yLevelNumber);
		}
		
		String result = passedLevels.size() == n ? "I become the guy." : "Oh, my keyboard!";
		
		System.out.println(result);
	}
}