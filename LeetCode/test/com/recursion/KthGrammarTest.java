package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthGrammarTest {
    KthGrammar kthGrammar = new KthGrammar();
    int N = 4;
    int K = 5;
    @BeforeEach
    void setUp() {
    }

    @Test
    void kthGrammar() {
        System.out.println("第" + N + "行第" + K + "个数字是：\r\n");
        System.out.println(kthGrammar.kthGrammar(4,5));
    }
}