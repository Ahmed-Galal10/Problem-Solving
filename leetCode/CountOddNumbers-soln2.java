class Solution {
    public int countOdds(int low, int high) {
        if(isOdd(low)){
            low--;
        }
        if(high % 2 != 0){
            high++; 
        }

        return (high - low) / 2 ;
    }

    private static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}