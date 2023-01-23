class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] peopleArr = new int[n+1];
        for (int[] oneTrust : trust){
            peopleArr[oneTrust[0]]++;
        }

        for (int i = 1; i <= n; i++){
            if (peopleArr[i] == 0){
                return i;
            }
        }

        return -1 ;
    }
}