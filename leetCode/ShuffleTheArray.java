class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArr = new int[nums.length];
        int xElement = 0;
        int index = 0;
        
        while (index < nums.length){
            shuffledArr[index] = nums[xElement];
            shuffledArr[index+1] = nums[xElement + n];
            xElement++;
            index += 2;
        }
        return shuffledArr;
    }
}