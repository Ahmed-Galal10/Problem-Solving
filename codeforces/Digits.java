import java.util.*;


public class Digits{

    public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < cases; i++){
            String num = input.next();
            
            for(int j = num.length() - 1 ; j >= 0 ; j--){
                result.append(num.charAt(j) + " ");
            }
            
            result.append("\n");
        }
        
        
        System.out.println(result);
    }

}