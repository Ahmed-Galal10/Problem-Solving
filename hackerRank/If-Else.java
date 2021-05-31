import java.util.Scanner;

public class If-Else{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close();

        String result = ( num % 2 != 0 || ( num >= 6 & num <= 20) ) ?
                         "Weird" : "Not Weird";
        
        System.out.println(result);
            
    }
}