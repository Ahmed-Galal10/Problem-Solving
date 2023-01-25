class Solution {
    public int removeDuplicates(int[] nums) {
        int currentNumIndex = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[currentNumIndex] != nums[i]){
                nums[currentNumIndex + 1] = nums[i];
                currentNumIndex++;
            }
        }

        return currentNumIndex + 1; 
    }
}