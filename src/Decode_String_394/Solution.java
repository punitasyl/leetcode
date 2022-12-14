package Decode_String_394;

import java.util.Stack;

/**
 * Created by Assylbek on 30.09.2022.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeString("3[a]2[bc]"));
    }

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        for (int i=0; i<n; ++i){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                int num = c-'0';
                while (i+1 < n && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + s.charAt(i+1)-'0';
                    i++;
                }
                numStack.push(num);
            }
            else if (c == '[') {
                strStack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if (c == ']'){
                int repeats = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j=0; j<repeats; ++j){
                    temp.append(sb);
                }
                sb = temp;
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
