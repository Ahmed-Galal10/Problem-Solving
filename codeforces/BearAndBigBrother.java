import java.util.Scanner;


public class BearAndBigBrother{

    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        int limakWeight = input.nextInt();
        int bobWeight = input.nextInt();

		int year = 0;
		
		while(limakWeight <= bobWeight){
			limakWeight *= 3;
			bobWeight *= 2;
			year++;
		}
		
		
		System.out.print(year);
    }
}