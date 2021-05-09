import java.util.*;


public class LastYearSubstring{
	
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int cases = input.nextInt();
        
        StringBuilder result = new StringBuilder("");
                
        String regex = "(2020.*)||(202.*0)||(20.*20)||(2.*020)||(.*2020)";
       
        boolean isMatched = false;
        
        for(int i=0; i < cases; i++){
            int strLength = input.nextInt();
            String word = input.next();
			
            isMatched = word.matches(regex);
            if(isMatched){
                result.append("YES\n");
            }
            else{
                result.append("NO\n");
            }
        }
    
        System.out.println(result); 
    }
}