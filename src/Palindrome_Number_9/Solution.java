package Palindrome_Number_9;

/**
 * Created by Assylbek on 31.08.2022.
 */
public class Solution {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12521));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x!=0)) {
            return false;
        }
        int reverseNum = 0;
        while (x > reverseNum) {

            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }

        return x == reverseNum || x == reverseNum / 10;

    }
}
