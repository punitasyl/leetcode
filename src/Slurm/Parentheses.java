package Slurm;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Assylbek on 16.08.2022.
 */
public class Parentheses {
    public static void main(String[] args) {

        System.out.println(isValidParentheses("()")); //true
        System.out.println(isValidParentheses("((()))")); //true
        System.out.println(isValidParentheses2("()()()")); //true

        System.out.println(isValidParentheses("()(")); //false
        System.out.println(isValidParentheses("((())")); //false
        System.out.println(isValidParentheses2(")(())(")); //false

        System.out.println(isValidParentheses2("(("));
    }

    static boolean isValidParentheses(String s) {


        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i < s.length(); i++)
        {
            char symb = s.charAt(i);
            if (symb == '(') stack.push(symb);
            if (symb == ')')
            {
                if (stack.size() == 0) return false;
                stack.pop();
            }

        }
        if (stack.size() > 0 ) return false;
        return true;
    }

    static boolean isValidParentheses2(String s) {

        int counter = 0;

        for (char i: s.toCharArray())
        {
            switch (i)
            {
                case '(':
                    counter++;
                    break;
                case ')':
                    if (counter == 0) return false;
                    counter--;
                    break;
            }
        }
        return counter == 0;
    }
}
