package leetCode_20_validParentheses;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[] ";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if(s.isEmpty()) return false;

        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray() ){
            if (c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if (c ==']' && !stack.isEmpty() && stack.peek() =='['){
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() =='}' ) {
                stack.pop();
            }

        }
        return stack.isEmpty();


    }
}
