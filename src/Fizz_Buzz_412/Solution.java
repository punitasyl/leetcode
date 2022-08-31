package Fizz_Buzz_412;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Assylbek on 31.08.2022.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (i % 3 == 0 && i % 5== 0) {
                results.add("FizzBuzz");
            } else if(i % 3 == 0) {
                results.add("Fizz");
            } else if (i % 5 ==0) {
                results.add(("Buzz"));
            } else {
                results.add(Integer.toString(i));
            }
         }

        return results;

    }
}
