import java.util.Scanner;


public class Factorial{

    public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        
        String isfactorialEven =  (number != 1) ? "YES" : "NO" ;
        
        System.out.println(isfactorialEven);
    }

}