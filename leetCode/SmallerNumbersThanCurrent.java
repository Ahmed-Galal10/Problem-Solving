import java.util.*;

class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arrList = new ArrayList<Integer>();
        
        for(int num : nums){
            arrList.add(Arrays.asList(nums).indexOf(num));
        }
 
        int[] result = arrList.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}