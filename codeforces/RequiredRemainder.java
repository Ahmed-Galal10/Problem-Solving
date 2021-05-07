import java.util.*;


public class RequiredRemainder{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int inputLength = input.nextInt();
			
			for(int i = 0; i < inputLength; i++){
				
				int x = input.nextInt();
				int y = input.nextInt();
				int n = input.nextInt();
				
				int k = n - ( (n - y) % x);
				System.out.println(k);
			}
	}
}