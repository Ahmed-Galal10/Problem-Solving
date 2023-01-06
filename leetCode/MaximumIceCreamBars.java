class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int iceCreamBars = 0;
        int currentIceCosts = 0;

        for (int barCost : costs){
            if(currentIceCosts + barCost > coins){
                break;
            } else {
                currentIceCosts += barCost;
                iceCreamBars++;
            }
        }

        return iceCreamBars;
    }
}