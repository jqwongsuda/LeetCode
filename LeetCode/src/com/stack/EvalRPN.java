package com.stack;

import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0 || tokens == null)
            return 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].equals("+")  || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                int low = stack.pop();
                int high = stack.pop();
                int res = 0;
                switch (tokens[i])
                {
                    case "+":
                        res = high + low;
                        break;
                    case "-":
                        res = high - low;
                        break;
                    case "*":
                        res = high * low;
                        break;
                    case "/":
                        res = high / low;
                        break;
                    default:
                        break;
                }
                stack.push(res);
            }
            else
                stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.peek();
    }
}
