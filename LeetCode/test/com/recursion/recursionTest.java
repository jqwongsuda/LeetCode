package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class recursionTest {
    Recursion recursion = new Recursion();
    ListNode listNode = new ListNode(1);
    @BeforeEach
    void setUp() {
        ListNode tmp = listNode;
        for(int i = 2; i < 5; i++)
        {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        System.out.println("两两交换节点前：" + listNode);
    }

    @Test
    void swapPairs() {
        ListNode ln = recursion.swapPairs(listNode);
        System.out.println("两两交换节点后：" + ln);
    }
}