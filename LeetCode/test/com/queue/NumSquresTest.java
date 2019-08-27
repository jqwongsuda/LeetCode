package com.queue;

import org.junit.jupiter.api.Test;
import com.queue.NumSqures;

import static org.junit.jupiter.api.Assertions.*;

class NumSquresTest {

    @Test
    void numSquares() {
        int n = 12;
        NumSqures numSqures = new NumSqures();
        System.out.println(n + "的完全平方数有" + numSqures.numSquares(n) + "个");

    }
}