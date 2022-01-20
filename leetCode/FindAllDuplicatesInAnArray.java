class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> dublicateList = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                dublicateList.add(nums[i]);
            }
        }
        
        return dublicateList;
    }
}