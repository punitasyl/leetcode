package Factorial_Trailing_Zeroes_172;

/**
 * Created by Assylbek on 31.08.2022.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));
    }
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count +=n;
        }
        return count;
    }
}
