package com.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvalRPNTest {
    private EvalRPN evalRPN;
    private String[] tokens;
    private String assertMessage;
    private String[] tokens2;
    @BeforeEach
    void setUp() {
        evalRPN = new EvalRPN();
        tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        tokens2 = new String[]{"2","1","+","3","*"};
        assertMessage = "";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void evalRPN() {

        System.out.println("tokens 期望值为22，实际值为：" + evalRPN.evalRPN(tokens));
        System.out.println("tokens2期望值为9，实际值为：" + evalRPN.evalRPN(tokens2));

    }
}