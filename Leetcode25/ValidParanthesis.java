package Leetcode25;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {

        String s="()[]{}";
        System.out.println(validP(s));

    }

    static boolean validP(String s){

        Stack<Character> stack=new Stack<>();


        for(int i=0;i<s.length();i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }


            else {

                if (stack.isEmpty()) {
                    return false;
                }
                char top=stack.peek();

                if ((ch == ')'&& top=='(')||(ch == '}'&& top=='{')||(ch == ']'&& top=='[')){
                    stack.pop();
                }
                else{
                    return false;
                }

            }


        }
            return stack.isEmpty();
    }


}
