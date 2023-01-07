class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(Arrays.stream(cost).sum() > Arrays.stream(gas).sum()){
            return -1;
        }

        int startStation = 0;
        int currentGas = 0;
        for (int i = 0; i < gas.length; i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                startStation = i + 1;
                currentGas = 0;
            }
        }
        return startStation;
    }
}