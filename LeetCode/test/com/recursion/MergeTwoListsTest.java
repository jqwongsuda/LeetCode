package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoListsTest {
    ListNode head1;
    ListNode head2;
    MergeTwoLists mergeTwoLists = new MergeTwoLists();
    @BeforeEach
    void setUp() {
        head1 = new ListNode(1);
        head2 = new ListNode(2);
        ListNode tmp1 = head1;
        ListNode tmp2 = head2;
        for(int i = 2; i < 5; i++)
        {
            tmp1.next = new ListNode(i * 2 - 1);
            tmp1 = tmp1.next;
            tmp2.next = new ListNode(i*3-1);
            tmp2 = tmp2.next;
        }
        tmp1.next = null;
        tmp2.next = null;

    }

    @Test
    void mergeTwoLists() {
        System.out.println("链表1：" + head1);
        System.out.println("链表2：" + head2);
        System.out.println("合并后：" + mergeTwoLists.mergeTwoLists(head1,head2));
    }
}