class TwoSum2{
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumIndexes = new int[2];

        HashMap<Integer, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbersMap.containsKey(target - nums[i])) {
                numbersMap.put(nums[i], i);
            } 
            else {
                twoSumIndexes[0] = numbersMap.get(target - nums[i]);
                twoSumIndexes[1] = i;
                break;
            }
        }
        return twoSumIndexes;
    }
}
}