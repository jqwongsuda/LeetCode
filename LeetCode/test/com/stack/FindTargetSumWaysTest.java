package com.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTargetSumWaysTest {
    int[] nums;
    int S;
    int res1;
    int res2;
    FindTargetSumWays findTargetSumWays;
    @BeforeEach
    void setUp() {
        nums = new int[]{1, 1, 1, 1, 1};
        S = 3;
        findTargetSumWays = new FindTargetSumWays();
    }

    @AfterEach
    void tearDown() {
        System.out.println("共有 " + res1 + " 种方法");
        System.out.println("共有 " + res2 + " 种方法");

    }

    @Test
    void findTargetSumWays() {
        res1 = findTargetSumWays.findTargetSumWays(nums,3);
        res2 = findTargetSumWays.findTargetSumWaysDP(nums,3);

    }
}