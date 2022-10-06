import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BigInteger firstNumber = input.nextBigInteger();
        BigInteger secondNumber = input.nextBigInteger();
        
        System.out.println(firstNumber.add(secondNumber));
        System.out.println(firstNumber.multiply(secondNumber));
    }
}