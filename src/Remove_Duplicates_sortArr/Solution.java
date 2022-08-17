package Remove_Duplicates_sortArr;

public class Solution {
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1,2,2,3,4,4,4,5,5,6,7}));
    }

    static int removeDuplicates(int[] nums) {
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
