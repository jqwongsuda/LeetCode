package com.recursion;

public class Recursion {
    /**
     * 两两交换链表中的节点
     * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     *
     * 示例:
     *
     * 给定 1->2->3->4, 你应该返回 2->1->4->3.
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode temp = new ListNode(0);//必须新建一个节点用来辅助
        temp.next = head.next;//指向第二个节点
        head.next = swapPairs(head.next.next);//上面保存了第二个节点的引用，因此这里可以直接将第一个节点指向第三个节点而不怕第二个节点丢失
        temp.next.next = head;

        return temp.next;
    }
}
