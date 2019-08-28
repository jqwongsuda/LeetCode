package com.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    private int[] temperatures;
    private int[] res;
    private DailyTemperatures dailyTemperatures;
    @BeforeEach
    void setUp() {
        dailyTemperatures = new DailyTemperatures();
        temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        res  = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void dailyTemperatures() {

        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        System.out.println("期望结果数组为：");
        for(int i : temperatures)
        {
            System.out.print(i + "  ");
        }
        System.out.println("\r\n期望结果数组为：");
        for(int i : res)
        {
            System.out.print(i + "  ");
        }
        System.out.println("\r\n期望结果数组为：");
        for(int i : result)
        {
            System.out.print(i + "  ");
        }
    }
}