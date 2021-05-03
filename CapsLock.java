import java.util.*;


public class CapsLock{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String inputWord = input.next();
		
		System.out.println(checkCaps(inputWord));
		
	}
	
	private static String checkCaps(String word){
		
		// using ternary operation instead of if .. else Block
		String resWord = word.toUpperCase().equals(word) ? word.toLowerCase() : ( isRevCapitlize(word) ? capitlize(word) : word );
		
		return resWord;
		
		/*if(word.toUpperCase().equals(word)){
			resWord = word.toLowerCase();
		}
		else if(isrevCapitlize(word)){
			resWord = capitlize(word);
		}
		else{
			resWord = word;
		}
		*/
	}
	
	private static String capitlize(String txt){
		 return (txt.substring(0, 1).toUpperCase() + txt.substring(1).toLowerCase());
	}
	
	private static boolean isRevCapitlize(String txt){
		return (txt.equals(txt.substring(0, 1).toLowerCase() + txt.substring(1).toUpperCase()));
	}
}