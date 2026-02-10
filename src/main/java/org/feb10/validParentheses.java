package org.feb10;

import java.util.ArrayDeque;
import java.util.Deque;

public class validParentheses {
    static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<>();
        String str = "[{()}]";
        for(int i =0;i<str.length();i++ ){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    System.out.println("stack is empty");
                    return;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(') {
                    System.out.println("first condition pe fas gaya");
                    return;
                }
                if(ch == '}' && top != '{'){
                    System.out.println("second conddd");
                    return;
                }if(ch == ']' && top != '['){
                    System.out.println("third pe gaya");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
        return;
    }
}
