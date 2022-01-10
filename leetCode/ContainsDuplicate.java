class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
        // int[] distinctNums = Arrays.stream(nums).distinct().toArray();
        // return (nums.length != distinctNums.length); 
        // OR :
        
        Set<Integer> numSet = new HashSet<>();
        
        for(int num : nums){
            if(numSet.contains(num)){
                return true;
            }
            numSet.add(num);
        }
        
        return false; 
    }
}