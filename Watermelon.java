import java.util.Scanner;

public class Watermelon{

     public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        int weight = input.nextInt();
        
        String result = (weight > 2 && weight % 2 == 0) ? "YES" : "NO";
        
        System.out.println(result);
     }
}