import java.util.*;


public class Hulk{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        StringBuilder result = new StringBuilder("");
        
        if(num == 1){
            result.append("I hate it");
        }
        else{
            for(int i = 1; i < num; i++){
                if(i % 2 != 0){
                    result.append("I hate that ");
                }
                else{
                    result.append("I love that ");
                }
            }
            String finalString = (num % 2 == 0) ? "I love it" : "I hate it";
            result.append(finalString);
        }
      
        System.out.println(result); 
    }
}