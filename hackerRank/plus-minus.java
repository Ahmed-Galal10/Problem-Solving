import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float positiveRatio = 0;
        float negativeRatio = 0;
        float zeroRatio = 0;

        for (Integer num : arr) {
            if (num > 0 ){
                positiveRatio++;
            } else if (num < 0){
                negativeRatio++;
            } else {
                zeroRatio++;
            }
        }
        System.out.printf("%.6f\n", positiveRatio / arr.size());
        System.out.printf("%.6f\n", negativeRatio / arr.size());
        System.out.printf("%.6f\n", zeroRatio / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
