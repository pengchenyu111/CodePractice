package com.pcy.coding.leetcode;


import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode24 {


    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode start = preNode;
        while (preNode.next != null && preNode.next.next != null){
            ListNode node1 = preNode.next;
            ListNode node2 = preNode.next.next;
            preNode.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            preNode = node1;
        }

        return start.next;
    }
}
