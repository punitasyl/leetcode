package Single_Number;

/**
 * Created by Assylbek on 23.08.2022.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {

        for (int i=1; i<nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];

    }
}
