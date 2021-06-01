import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("================================");
            
            for(int i = 0; i < 3; i++)
            {
                String str = input.next();
                int num = input.nextInt();
                System.out.printf("%-15s%03d%n", str, num) ;
            }
            
            System.out.println("================================");

    }
}