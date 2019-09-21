package com.recursion;

public class ReverseList {
    ListNode headNode = new ListNode(0);
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        reverseHelp(head).next = null;
        return headNode;
    }
    public ListNode reverseHelp(ListNode head)
    {
        if(head.next == null)
        {
            headNode = head;
            return head;
        }
        ListNode resNode;
        reverseHelp(head.next).next = head;
        return head;
    }
}
