package com.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumSquresTest {

    @Test
    void numSquares() {
        NumSqures numSqures = new NumSqures();
        System.out.println("12 的完全平方数有" + numSqures.numSquares(12) + "个");
    }
}