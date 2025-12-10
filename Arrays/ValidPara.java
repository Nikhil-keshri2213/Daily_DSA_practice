/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Concept: Stack
*/

import java.util.Stack;
public class ValidPara {
    public static boolean validPara(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }
            if((stk.peek() == '(' && c == ')')||(stk.peek() == '{' && c == '}')||(stk.peek() == '[' && c == ']')){
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
    
    public static void main(String[] args) {
        // String s = "()"; //Test 1 true
        // String s = "()[]{}"; //Test 2 true
        // String s = "(]"; //Test 3 false
        // String s = "([])"; //Test 4 true
        String s = "([)]"; //Test 5 false
        System.out.println("is Valid: "+ validPara(s));
    }
}
