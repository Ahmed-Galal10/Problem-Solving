class Solution {
    public int numIdenticalPairs(int[] nums) {
       Map<Integer, Integer> occurs = new HashMap<>();
        int ideticalPairs = 0;

        for (int num : nums){
            if (occurs.containsKey(num)){
                occurs.put(num, occurs.get(num) + 1);
            } else {
                occurs.put(num, 1);
            }
        }

        for (Integer numOfOcuurs : occurs.values()){
            ideticalPairs += numOfOcuurs * (numOfOcuurs-1) / 2;
        }

        return ideticalPairs; 
    }
}