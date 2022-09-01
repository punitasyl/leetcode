package Pow_50;

/**
 * Created by Assylbek on 01.09.2022.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.0000, -2));
    }

    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if (n < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            return (double)(1.0) / (double) ans;
        }
        return ans;
    }
}
