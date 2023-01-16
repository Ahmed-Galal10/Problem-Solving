class Solution {
    public int arraySign(int[] nums) {
        int signResult = 1;
        for (int num : nums){
            if(num == 0){
                return 0;
            }
            if (num < 0){
                signResult *= -1;
            }
        }
        return signResult;
    }
}