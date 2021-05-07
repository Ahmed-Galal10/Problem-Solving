import java.util.*;


public class Pum{

    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        int lines = input.nextInt();
        
        int limit = lines * 4;
        
        StringBuilder result = new StringBuilder("");
        
        for(int i = 1; i <= limit; i++){
            if(i % 4 != 0){
                result.append(i + " ");
            }
            else{
                result.append("PUM" + "\n");
            }
        }
        
        System.out.println(result);
    }
}