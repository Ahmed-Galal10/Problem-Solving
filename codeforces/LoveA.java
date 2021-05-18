import java.util.Scanner;


public class LoveA{
	
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String str = input.next();
        
		long charACounter = str.chars().filter(ch -> ch == 'a').count();
		long stringWithoutA = str.length() - charACounter;

		long result = Math.min( (2 * charACounter - 1), str.length() );
		
        System.out.println(result); 
    }
}