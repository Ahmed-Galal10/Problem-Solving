import java.util.Scanner;
import java.util.Stack;


public class GameWithString{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		int consCounter = getWinner(str);
		
		String result = (consCounter % 2 != 0) ? "Yes" : "No"; 
		
		System.out.println(result);

	}
	
	public static int getWinner(String str){
		
		Stack<Character> charStack = new Stack<>();
		int counter = 0;
		
		for(Character c: str.toCharArray()){
			
			if(( !charStack.empty() ) && c.equals(charStack.peek())){
				charStack.pop();
				counter++;
			}
			else{
				charStack.push(c);
			}
		}
		
		return counter;
	}
}