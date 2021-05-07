import java.util.Scanner;


public class FourNumbers{

    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        
		long multiplyResult = (long) n1 * n2 * n3 * n4;
		System.out.print(multiplyResult);
    }
}