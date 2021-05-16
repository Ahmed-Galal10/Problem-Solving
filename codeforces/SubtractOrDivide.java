import java.util.Scanner;

public class SubtractOrDivide{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for(int i =0; i < cases; i++){
            int number = input.nextInt();
            int moves = reduceToZero(number);
            System.out.println(moves);
        }

    }

    public static int reduceToZero(int num){

        if(num == 1 || num == 2){
            return num - 1;
        }
        else if(num % 2 == 0 || num == 3){
           return  2;
        }
        else{
            return  3;
        }

    }

}
