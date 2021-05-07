import java.util.*;


public class NewYearCandles{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int currentCandles = input.nextInt();
			int hoursPerOne = input.nextInt();
			
			int allCandles = getFinalCandels(currentCandles, hoursPerOne);
			
			System.out.println(allCandles);
	}
	
	public static int getFinalCandels(int currentCandles, int hoursPerOne){
		int allCandles = currentCandles;
		
		while(currentCandles >= hoursPerOne){
			allCandles += currentCandles / hoursPerOne;
			currentCandles = (currentCandles / hoursPerOne) + (currentCandles % hoursPerOne) ;
		}
		
		return allCandles;
	}
}