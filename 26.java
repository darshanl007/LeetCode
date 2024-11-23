import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
       int i = 0;
       //for each loop
       for(int num:set){
        nums[i++] = num;
       }
       return set.size();
    }
}