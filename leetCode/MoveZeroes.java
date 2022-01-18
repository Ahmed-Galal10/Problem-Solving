class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int currentNum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[currentNum] = nums[i];
                currentNum++;
            }
        }
        
        for(int i = currentNum; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}