import java.util.Scanner;


public class JavaLoopsI{
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + i * num);
        }

    }
}