package Roman_to_Integer_13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Assylbek on 13.10.2022.
 */
class Solution {
    Map<Character,Integer> romanMap;

    Solution() {
        this.romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("IXIX"));
        System.out.println(solution.romanToInt2("IX"));
    }

    public int romanToInt(String s) {

        char prev = ' ';

        int ans = 0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='I' && prev == 'V' || s.charAt(i)=='I' && prev == 'X'){
                ans-=1;
            }else if(s.charAt(i)=='X' && prev == 'L' || s.charAt(i)=='X' && prev == 'C'){
                ans-=10;
            }else if(s.charAt(i)=='C' && prev == 'D' || s.charAt(i)=='C' && prev == 'M'){
                ans-=100;
            }else{
                ans += this.romanMap.get(s.charAt(i));
            }

            prev = s.charAt(i);
        }

        return ans;
    }

    public int romanToInt2(String s) {
        int ans = 0;

        for (int i = 0; i<s.length(); i++) {

            if (i < s.length() - 1 && this.romanMap.get(s.charAt(i))<this.romanMap.get(s.charAt(i+1))) {
                ans-= this.romanMap.get(s.charAt(i));
            } else {
                ans+= this.romanMap.get(s.charAt(i));
            }
        }

        return ans;
    }
}
