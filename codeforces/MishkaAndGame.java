import java.util.Scanner;


public class MishkaAndGame{
	public static void main(String[] args){
		
		int counter = 0;
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
				
		for(int i = 0; i < n; i++){
			counter += Integer.compare(input.nextInt(), input.nextInt());
		}
		
		displayResult(counter);
	}
	
	
	public static void displayResult(int counter){
		String result = counter > 0 ? "Mishka" : (counter < 0 ? "Chris" : "Friendship is magic!^^");
		System.out.println(result);
	}
}