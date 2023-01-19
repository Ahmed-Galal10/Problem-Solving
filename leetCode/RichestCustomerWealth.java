class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int customerWealth;
        for (int[] customerMoney : accounts){
            customerWealth = Arrays.stream(customerMoney).sum();
            maxWealth = Math.max(customerWealth, maxWealth);
        }

        return maxWealth;
    }
}