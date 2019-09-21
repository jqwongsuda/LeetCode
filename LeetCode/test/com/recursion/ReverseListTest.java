package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    ListNode head;
    ReverseList reverseList = new ReverseList();
    @BeforeEach
    void setUp() {
        head = new ListNode(1);
        ListNode tmp = head;
        for(int i = 2; i < 10; i++)
        {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        tmp.next = null;

    }

    @Test
    void reverseList() {
        System.out.println("翻转前链表：" + head);

        System.out.println("翻转后链表：" + reverseList.reverseList(head));
    }
}