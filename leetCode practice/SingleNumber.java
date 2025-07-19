import java.util.HashSet;
import java.util.Set;

class Scratch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 7, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums){
            if (!numsSet.contains(num)){
                numsSet.add(num);
            } else {
                numsSet.remove(num);
            }
        }

        return numsSet.iterator().next();
    }
}