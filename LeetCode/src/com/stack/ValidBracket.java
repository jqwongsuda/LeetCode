package com.stack;

import java.util.Stack;

public class ValidBracket {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            var tmp = s.charAt(i);
            if(tmp == '(' || tmp == '[' || tmp == '{')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.isEmpty()) return false;
                if(tmp == ')' && stack.peek() != '(') return false;
                if(tmp == ']' && stack.peek() != '[') return false;
                if(tmp == '}' && stack.peek() != '{') return false;
                stack.pop();
            }

        }

        return stack.empty();
    }
}
