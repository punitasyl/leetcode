package Reverse_Words_String;

/**
 * Created by Assylbek on 12.09.2022.
 */
class Solution {

    public static void main(String[] args) {

        System.out.println(reverseWords("The sky is blue"));
    }

    public static String reverseWords(String s) {

        StringBuffer sb = new StringBuffer();


        String[] arrayString = s.trim().split(" ");

        for(int i=arrayString.length-1; i>=0; i--) {
            sb.append(arrayString[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
