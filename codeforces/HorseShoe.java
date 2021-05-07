import java.util.*;


public class HorseShoe{

    public static void main(String[] args){
		
		// to remove dublicates colors
        Set<Integer> shoesSet = new HashSet<>();
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 4; i++){
            shoesSet.add(input.nextInt());
        }
      
        int shoesNeeded = 4 - shoesSet.size();
        
        System.out.println(shoesNeeded);
    }
}