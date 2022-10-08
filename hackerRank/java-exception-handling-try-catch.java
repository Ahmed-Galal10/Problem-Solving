import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                
        try(Scanner input = new Scanner(System.in)){
            int x = input.nextInt();
            int y = input.nextInt();
        
            System.out.println(x / y);
        } catch(InputMismatchException ex){
            System.out.println(ex.getClass().getName());
        } catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
}