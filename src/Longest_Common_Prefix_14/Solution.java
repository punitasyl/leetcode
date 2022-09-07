package Longest_Common_Prefix_14;

/**
 * Created by Assylbek on 06.09.2022.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"lead","leetcode", "dawdw"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
