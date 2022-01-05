import java.util.*;

class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> sortedNumslist = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(sortedNumslist);
        
        List<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numsList.add(sortedNumslist.indexOf(nums[i]));
        }
        
        int[] resultArr = numsList.stream().mapToInt(Integer::intValue).toArray();

        return resultArr;
    }
}