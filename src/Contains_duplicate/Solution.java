package Contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Assylbek on 21.08.2022.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (set.contains(nums[i])) {
                    return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
