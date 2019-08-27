package com.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    MinStack minStack = new MinStack();
    @Test
    void test()
    {
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        System.out.println("栈顶元素：" + minStack.top());

        minStack.pop();
        System.out.println("pop()弹出一个栈顶元素，当前栈顶元素变为：" + minStack.top());
        System.out.println("栈中最小元素：" + minStack.getMin());
    }
    @Test
    void push() {


    }

    @Test
    void pop() {

    }

    @Test
    void top() {

    }

    @Test
    void getMin() {


    }
}