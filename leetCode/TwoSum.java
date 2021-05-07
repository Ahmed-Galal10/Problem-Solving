class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        outerfor(int i = 0 ; i  nums.length; i++){
            int first = nums[i];
            for(int j = 0; j  nums.length; j++){
                if(i == j ){
                    continue;
                }
                else if(target - first == nums[j]){
                    result[0] = i;
                    result[1] = j;
                    break outer;
                }
            }
        }
        return result;  
    }
}