import java.util.Arrays;

/**
 * Created by Assylbek on 07.08.2022.
 */
public class Task_1480 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {

        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i=1; i<nums.length; i++) {

            results[i] = nums[i] + results[i-1];

        }
        return results;
    }


}
