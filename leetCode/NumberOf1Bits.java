public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int totalOnes = 0;
        while (n != 0){
            totalOnes += n & 1;
            n >>>= 1;
        }

        return totalOnes;
    }
}