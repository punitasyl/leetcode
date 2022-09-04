package Reverse_String_344;

/**
 * Created by Assylbek on 04.09.2022.
 */
public class Solution {
    public static void main(String[] args) {

        char[] arrChar = {'h','e','l','l','o'};

        Solution solution = new Solution();
        solution.reverseString(arrChar);
        System.out.println(arrChar);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while( left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
