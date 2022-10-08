import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        
        printArray(integerArray);
        printArray(stringArray);
    }
    
    public static <T> void printArray(T[] userArray){
        for (T element : userArray) {
            System.out.println(element);
        }
    } 
}