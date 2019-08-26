package com.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenLockTest {

    @Test
    void openLock() {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        OpenLock test = new OpenLock();

        System.out.println("打开锁至少需要" + test.openLock(deadends,target) + " 步！");
    }
}