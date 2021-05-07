import java.util.Scanner;


public class Game{

    public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        
        int firstBalls = input.nextInt();
        int secondBalls = input.nextInt();
        int firstThrows = input.nextInt();
        int secondThrows = input.nextInt();
        
        String winner = firstBalls > secondBalls ? "First" : "Second";

        System.out.println(winner);
    }
}