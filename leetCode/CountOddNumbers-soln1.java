class Solution {
    public int countOdds(int low, int high) {
        return isOdd(low) ^ isOdd(high) ? (high - low + 1) / 2
                : ( (isOdd(low) & isOdd(high) ? (high - low + 2) / 2 : (high - low) / 2 ) );
    }

    private static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}